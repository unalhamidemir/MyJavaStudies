package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.Candidate;

public interface CandidateDao extends JpaRepository<Candidate, Integer>{
	
	boolean existsCandidateByEmail(String email);
	boolean existsCandidateByNationalIdentity(String nationalIdentity);

}
