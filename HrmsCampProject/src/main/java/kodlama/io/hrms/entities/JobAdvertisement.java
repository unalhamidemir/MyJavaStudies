package kodlama.io.hrms.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="job_advertisements")

public class JobAdvertisement {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="description")
	private String description;
	
	@Column(name="number_of_open_position")
	private int numberOfOpenPosition;
	
	@Column(name="status")
	private boolean status;
	
	@Column(name="create_date")
	private Date createDate;
	
	@Column(name="end_date")
	private Date endDate;
	
	@Column(name="salary_min")
	private int salaryMin;
	
	@Column(name="salary_max")
	private int salaryMax;
	
	@ManyToOne()
	@JoinColumn(name="employer_id")
	private Employer employer;
	
	@ManyToOne()
	@JoinColumn(name="job_position_id")
	private JobPosition jobPosition;
	
	@ManyToOne
	@JoinColumn(name="company_id")
	private Company company;
	
	
	@ManyToOne
	@JoinColumn(name="city_id")
	private City city;


	public JobAdvertisement(int id, String description, int numberOfOpenPosition, boolean status, Date createDate,
			Date endDate, int salaryMin, int salaryMax, Employer employer, JobPosition jobPosition, Company company,
			City city) {
		super();
		this.id = id;
		this.description = description;
		this.numberOfOpenPosition = numberOfOpenPosition;
		this.status = status;
		this.createDate = createDate;
		this.endDate = endDate;
		this.salaryMin = salaryMin;
		this.salaryMax = salaryMax;
		this.employer = employer;
		this.jobPosition = jobPosition;
		this.company = company;
		this.city = city;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getNumberOfOpenPosition() {
		return numberOfOpenPosition;
	}


	public void setNumberOfOpenPosition(int numberOfOpenPosition) {
		this.numberOfOpenPosition = numberOfOpenPosition;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public Date getCreateDate() {
		return createDate;
	}


	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public int getSalaryMin() {
		return salaryMin;
	}


	public void setSalaryMin(int salaryMin) {
		this.salaryMin = salaryMin;
	}


	public int getSalaryMax() {
		return salaryMax;
	}


	public void setSalaryMax(int salaryMax) {
		this.salaryMax = salaryMax;
	}


	public Employer getEmployer() {
		return employer;
	}


	public void setEmployer(Employer employer) {
		this.employer = employer;
	}


	public JobPosition getJobPosition() {
		return jobPosition;
	}


	public void setJobPosition(JobPosition jobPosition) {
		this.jobPosition = jobPosition;
	}


	public Company getCompany() {
		return company;
	}


	public void setCompany(Company company) {
		this.company = company;
	}


	public City getCity() {
		return city;
	}


	public void setCity(City city) {
		this.city = city;
	}

	

}
