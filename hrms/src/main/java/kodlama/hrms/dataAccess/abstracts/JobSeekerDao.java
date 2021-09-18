package kodlama.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.hrms.entities.concretes.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer> {

}
