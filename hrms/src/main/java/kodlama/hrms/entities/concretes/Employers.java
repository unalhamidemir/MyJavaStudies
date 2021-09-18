package kodlama.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "employers")
public class Employers {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "companyname")
	private String  companyName;
	
	@Column(name = "website")
	private String webSite;
	
	@Column(name = "email")
	private String eMail;
	
	@Column(name = "phonenumber")
	private String phoneNumber;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "repassword")
	private String rePassword;
	
	public Employers() {}

	public Employers(int id, String companyName, String webSite, String eMail, String phoneNumber, String password,
			String rePassword) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.webSite = webSite;
		this.eMail = eMail;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.rePassword = rePassword;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRePassword() {
		return rePassword;
	}

	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}

}
