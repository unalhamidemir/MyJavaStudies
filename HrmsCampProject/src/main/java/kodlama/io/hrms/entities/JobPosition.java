package kodlama.io.hrms.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="job_positions")
@JsonIgnoreProperties({"hibernateLazyInitialize","handler","jobAdvertisement"})
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class JobPosition {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String title;
	
	
	@OneToMany(mappedBy = "jobPosition")
	private List<JobAdvertisement> jobAdvertisement;


	public JobPosition(int id, String title, List<JobAdvertisement> jobAdvertisement) {
		super();
		this.id = id;
		this.title = title;
		this.jobAdvertisement = jobAdvertisement;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public List<JobAdvertisement> getJobAdvertisement() {
		return jobAdvertisement;
	}


	public void setJobAdvertisement(List<JobAdvertisement> jobAdvertisement) {
		this.jobAdvertisement = jobAdvertisement;
	}


	
	

}
