package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	

}
