package kodlama.hrms.core.concretes;

import org.springframework.stereotype.Service;

import kodlama.hrms.core.abstracts.EmployersMailVerificationService;
import kodlama.hrms.entities.concretes.SystemPersonnel;

@Service
public class EmployersMailVerificationManager implements EmployersMailVerificationService{

	@Override
	public boolean checkEmailSystemPersonnel(SystemPersonnel systemPersonnel) {
		
		return true;
	}

}
