package entities.concretes;

import entities.abstracts.Entity;

public class User implements Entity {
	private int id;
	private String firstName;
	private String lastName;
	private int dateOfBirth;
	private String identityNo;
	
	
	public User() {}


	public User(int id, String firstName, String lastName, int dateOfBirth, String identityNo) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.identityNo = identityNo;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getIdentityNo() {
		return identityNo;
	}


	public void setIdentityNo(String identityNo) {
		this.identityNo = identityNo;
	}
}

	
