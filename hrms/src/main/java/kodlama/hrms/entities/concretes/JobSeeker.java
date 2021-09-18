package kodlama.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "jobseeker")
public class JobSeeker {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "firstname")
	private String firstName;
	
	@Column(name = "lastname")
	private String lastName;
	
	@Column(name = "identitynumber")
	private String identityNumber; 
	
	@Column(name = "dateofbirth")
	private String dateOfBirth;
	
	@Column(name = "mail")
	private String mail;
	
	@Column(name = "password")
	private int password;
	
	@Column(name = "repassword")
	private int rePassword;
	
	public JobSeeker() {}

	public JobSeeker(int id, String firstName, String lastName, String identityNumber, String dateOfBirth, String mail,
			int password, int rePassword) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.dateOfBirth = dateOfBirth;
		this.mail = mail;
		this.password = password;
		this.rePassword = rePassword;
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

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public int getRePassword() {
		return rePassword;
	}

	public void setRePassword(int rePassword) {
		this.rePassword = rePassword;
	}

}
