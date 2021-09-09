package Entities;

import Abstract.IEntity;

public class Customer implements IEntity{
	
	public int id;
	public String FirstName;
	public String LastName;
	public int DateOfBirth;
	public String Nationality›d;
	
	
	
	   
	public Customer(int id, String firstName, String lastName, int dateOfBirth, String nationality›d) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
		Nationality›d = nationality›d;
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




	public String getNationality›d() {
		return Nationality›d;
	}




	public void setNationality›d(String nationality›d) {
		Nationality›d = nationality›d;
	}

}
