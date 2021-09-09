package Business.Abstracts;

public interface VerificationService {
	
	void sendVerifyEmail(String email);
	
	void verifyMail(String email);
	
	boolean checkVerifyAccount(String email);

}
