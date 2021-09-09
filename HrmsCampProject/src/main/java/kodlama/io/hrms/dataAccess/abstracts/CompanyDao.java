package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.Company;

public interface CompanyDao extends JpaRepository<Company, Integer>{
	
		boolean existsCompanyByName(String name);
}
