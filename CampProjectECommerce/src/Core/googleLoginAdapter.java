package Core;

import java.util.ArrayList;
import java.util.List;

import Business.Abstracts.VerificationService;

public class googleLoginAdapter implements VerificationService{
	List<String>verificatedEmails = new ArrayList<String>();

	@Override
	public void sendVerifyEmail(String email) {
		System.out.println(email +"Kullanýcýsýna Mail Gönderildi..");
		
	}

	@Override
	public void verifyMail(String email) {
		verificatedEmails.add(email);
		System.out.println(email+ "Dogrulama Baþarýlý..");
		}
		
	

	@Override
	public boolean checkVerifyAccount(String email) {
		if(verificatedEmails.contains(email)) {
			return true;
		}
		return false;
	}

}
