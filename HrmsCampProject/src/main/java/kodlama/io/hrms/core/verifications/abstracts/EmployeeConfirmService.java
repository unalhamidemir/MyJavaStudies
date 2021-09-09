package kodlama.io.hrms.core.verifications.abstracts;

import kodlama.io.hrms.entities.Employer;

public interface EmployeeConfirmService {
	
	public boolean isConfirmEmployee(Employer employer);

}
