package kodlama.hrms.core.abstracts;

public interface MailVerificationService {
	
	boolean isVerified(String email);
	
	boolean checkEmailFormat(String email);

}
