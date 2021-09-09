package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {
	
	boolean existsEmployerByEmail(String email);

}
