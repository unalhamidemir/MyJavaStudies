package Entities.Concretes;

import Entities.Abstracts.Entity;

public class Customer implements Entity{
	private int Id;
	private String firstName;
	private String lastName;
	private String eMail;
	private String password;
	
	public Customer() {}
	
	

	public Customer(int id, String firstName, String lastName, String eMail, String password) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.password = password;
	}



	public int getId() {
		return Id;
	}



	public void setId(int id) {
		Id = id;
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



	public String geteMail() {
		return eMail;
	}



	public void seteMail(String eMail) {
		this.eMail = eMail;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public void add(Customer customer) {
		// TODO Auto-generated method stub
		
	}



	public void update(Customer customer) {
		// TODO Auto-generated method stub
		
	}



	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		
	}



		
	}




		

	


