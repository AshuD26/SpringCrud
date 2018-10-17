package Spring.SpringHibernate1Integration;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.BeanFactory;
import org.hibernate.Transaction;



public class PersonDaoImpl implements PersonDao {
	private static final String beanFactory = null;
	public SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	public void save(Person p) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(p);
		tx.commit();
		session.close();
	}
	public void deletePerson(int id) {
		Session session=this.sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Person p5=(Person)session.get(Person.class, id);
		
		session.delete(p5);
		System.out.println("deleted......");
		tr.commit();		
		session.close();
		
		
	}
		
public Person updatePerson(int id) {
		
		Session session=this.sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Person p2=(Person)session.get(Person.class, id);
		p2.setName("Ankush");
		
		System.out.println("updated person is"+p2);
		session.update(p2);
		tr.commit();
		session.close();
		return p2;
	}
	public List<Person> list() {
		Session session = this.sessionFactory.openSession();
		List<Person> personList = session.createQuery("from Person").list();
		session.close();
		return personList;
		
		
	}
    
	
}


