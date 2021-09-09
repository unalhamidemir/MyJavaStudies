package kodlama.io.hrms.core.verifications.abstracts;

import kodlama.io.hrms.entities.Candidate;

public interface MernisVerificationService {
	
	boolean chechIfRealPerson(Candidate candidate);

}
