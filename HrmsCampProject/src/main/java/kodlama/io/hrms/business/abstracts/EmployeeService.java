package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.utilities.DataResult;
import kodlama.io.hrms.core.utilities.Result;
import kodlama.io.hrms.entities.Employee;

public interface EmployeeService {
	
	DataResult<List<Employee>> getAll();
	
	Result add(Employee employee);

}
