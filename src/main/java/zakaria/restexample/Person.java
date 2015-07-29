package zakaria.restexample;

public class Person {

	
	private String firstname;
	private String lastName;
	private int age;
	private String departement;
	
	
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
	
}
