package kodlama.hrms.core.abstracts;

import kodlama.hrms.entities.concretes.JobSeeker;

public interface MernisVerificationService {
	
	boolean checkIfRealPerson(JobSeeker jobSeeker);

}
