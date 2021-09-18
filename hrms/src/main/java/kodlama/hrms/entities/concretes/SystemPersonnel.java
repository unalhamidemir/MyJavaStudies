package kodlama.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "systempersonnel")
public class SystemPersonnel {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "firstname")
	private String firstName;
	
	@Column(name = "lastname")
	private String lastName;
	
	@Column(name = "employersconfirmation")
	private String employersConfirmation;
	
	public SystemPersonnel () {}

	public SystemPersonnel(int id, String firstName, String lastName, String employersConfirmation) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.employersConfirmation = employersConfirmation;
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

	public String getEmployersConfirmation() {
		return employersConfirmation;
	}

	public void setEmployersConfirmation(String employersConfirmation) {
		this.employersConfirmation = employersConfirmation;
	}

}
