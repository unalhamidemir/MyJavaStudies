package kodlama.hrms.core.abstracts;

import kodlama.hrms.entities.concretes.SystemPersonnel;

public interface EmployersMailVerificationService {
	
	public boolean checkEmailSystemPersonnel(SystemPersonnel systemPersonnel);

}
