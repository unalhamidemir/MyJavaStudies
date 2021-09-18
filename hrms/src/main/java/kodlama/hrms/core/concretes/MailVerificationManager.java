package kodlama.hrms.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import kodlama.hrms.core.abstracts.MailVerificationService;

@Service
public class MailVerificationManager implements MailVerificationService{

	@Override
	public boolean isVerified(String email) {
		if(!checkEmailFormat(email)) {
			return false;
		}
		return true;
	}

	@Override
	public boolean checkEmailFormat(String email) {
		String regex ="^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		  Pattern pattern = Pattern.compile(regex); 
		  Matcher matcher = pattern.matcher(email); 
		  return matcher.matches(); 
	
	}

}
