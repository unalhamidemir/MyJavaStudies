package kodlama.hrms.business.abstracts;

import java.util.List;

import kodlama.hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {
	List<JobSeeker> getAll();

}
