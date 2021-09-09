package kodlama.io.hrms.core.verifications.abstracts;

public interface EmailVerificationService {
	
	boolean isVerified(String email);
	boolean checkEmailFormat(String email);

}
