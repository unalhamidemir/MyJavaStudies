package Business.Concretes;

import java.util.ArrayList;
import java.util.List;

import Business.Abstracts.VerificationService;

public class MailVerificationManager implements VerificationService{
	
	List<String>vericatedEmails = new ArrayList<String>();

	@Override
	public void sendVerifyEmail(String email) {
		
		System.out.println("Dogrulama maili gönderildi  : " +email);
		
		
	}

	@Override
	public void verifyMail(String email) {
		
		vericatedEmails.add(email);
		
		System.out.println(email+ "Dogrulama Baþarýlý...");
		
	}

	@Override
	public boolean checkVerifyAccount(String email) {
		if(vericatedEmails.contains(email)) {
			return true;
		}
		return false;
	}

}
