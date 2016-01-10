package zakaria.restexample;

import java.util.ArrayList;
import java.util.List;



public class PersonRepository {
	
	List<Person> repository;
	
	public PersonRepository(){
		repository = new ArrayList<Person>();
		
		Person person = new Person();
		person.setFirstname("Zakaria");
		person.setLastName("Amine");
		person.setAge(26);
		person.setDepartement("Accounting");
		
		Account account1 = new Account();
		account1.setUsername("zamine");
		account1.setPassword("zamine123");
		
		Profile profile1 = new Profile();
		profile1.setActivities("Web developement, Team building");
		profile1.setDescription("Profile description");
		profile1.setInterests("Java, Spring, Running, Hiking");
		
		person.setAccount(account1);
		person.setProfile(profile1);
		
		Person person2 = new Person();
		person2.setFirstname("John");
		person2.setLastName("K.");
		person2.setAge(30);
		person2.setDepartement("IT");
		
		Account account2 = new Account();
		account2.setUsername("johnk");
		account2.setPassword("johnk123");
		
		Profile profile2 = new Profile();
		profile2.setActivities("Accounting, Financial Planning");
		profile2.setDescription("Profile description");
		profile2.setInterests("Boxing, Football, Stock Market");
		
		person2.setAccount(account2);
		person2.setProfile(profile2);
		
		Person person3 = new Person();
		person3.setFirstname("M.");
		person3.setLastName("Ibrahim");
		person3.setAge(35);
		person3.setDepartement("HR");
		
		Account account3 = new Account();
		account3.setUsername("mibrahim");
		account3.setPassword("mibrahim123");
		
		Profile profile3 = new Profile();
		profile3.setActivities("Management, Resource Planning");
		profile3.setDescription("Profile Description");
		profile3.setInterests("Swimming, Reading");
		
		person3.setAccount(account3);
		person3.setProfile(profile3);
		
		repository.add(person);
		repository.add(person2);
		repository.add(person3);
	}
	
	public Person retrieve(Integer id){	
		return repository.get(id);
	}
	

}
