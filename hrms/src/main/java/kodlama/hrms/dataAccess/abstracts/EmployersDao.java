package kodlama.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.hrms.entities.concretes.Employers;

public interface EmployersDao extends JpaRepository<Employers, Integer>{

}
