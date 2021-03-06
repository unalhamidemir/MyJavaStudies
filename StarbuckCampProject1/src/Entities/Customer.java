package Entities;

import Abstract.IEntity;

public class Customer implements IEntity{
	
	public int id;
	public String FirstName;
	public String LastName;
	public int DateOfBirth;
	public String Nationalityİd;
	
	
	
	   
	public Customer(int id, String firstName, String lastName, int dateOfBirth, String nationalityİd) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
		Nationalityİd = nationalityİd;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getFirstName() {
		return FirstName;
	}




	public void setFirstName(String firstName) {
		FirstName = firstName;
	}




	public String getLastName() {
		return LastName;
	}




	public void setLastName(String lastName) {
		LastName = lastName;
	}




	public int getDateOfBirth() {
		return DateOfBirth;
	}




	public void setDateOfBirth(int dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}




	public String getNationalityİd() {
		return Nationalityİd;
	}




	public void setNationalityİd(String nationalityİd) {
		Nationalityİd = nationalityİd;
	}

}
