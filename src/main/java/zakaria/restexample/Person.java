package zakaria.restexample;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Person extends ResourceSupport {

	
	private String firstname;
	private String lastName;
	private int age;
	private String departement;
	private Account account;
	private Profile profile;
	

	public Person(){
		
		
	}
	
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}


	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}


	/**
	 * @return the departement
	 */
	public String getDepartement() {
		return departement;
	}


	/**
	 * @param departement the departement to set
	 */
	public void setDepartement(String departement) {
		this.departement = departement;
	}

	@JsonIgnore
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@JsonIgnore
	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
}
