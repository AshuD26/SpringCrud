package Spring.SpringHibernate1Integration;

import java.util.List;

public interface PersonDao {
	
    public void save(Person p);
	
	public List<Person> list();
    public Person updatePerson(int id);
	
	public void deletePerson(int id);
	

}
