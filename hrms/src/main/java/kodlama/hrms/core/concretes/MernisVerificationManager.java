package kodlama.hrms.core.concretes;

import org.springframework.stereotype.Service;

import kodlama.hrms.core.abstracts.MernisVerificationService;
import kodlama.hrms.entities.concretes.JobSeeker;

@Service
public class MernisVerificationManager implements MernisVerificationService{

	@Override
	public boolean checkIfRealPerson(JobSeeker jobSeeker) {
		
		return true;
	}

}
