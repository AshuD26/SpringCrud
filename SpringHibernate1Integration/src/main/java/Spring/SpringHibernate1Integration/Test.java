package Spring.SpringHibernate1Integration;

import java.util.List;

import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		
		
		PersonDao pd=context.getBean(PersonDao.class);
		
		Person p1 = new Person(1, "Ashu", "India");
		
		pd.save(p1);
		
		Person p2 = new Person(2,"Anku","USA");
		pd.save(p2);
		Person p3 = new Person(3,"Kunu","UK");
		pd.save(p3);
		Person p4 = new Person(4,"Parag","London");
		pd.save(p4);
		Person p5 = new Person(5,"Snehal","Singapur");
		pd.save(p5);
		
			
		List<Person> list = pd.list();
		
		for(Person p : list){
			System.out.println("Person List::"+p);
			
			}
       
		
		pd.deletePerson(5);
		 pd.updatePerson(2);
		
		
		
		}

}
