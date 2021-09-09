package Business.Concretes;

import java.util.ArrayList;
import java.util.List;

import java.util.regex.*;

import Business.Abstracts.CustomerCheckService;
import Entities.Concretes.Customer;

public class CustomerCheckManager implements CustomerCheckService {
	
	
	private static final String EMAIL_PATTERN = null;
	List<String> listOfEmail = new ArrayList<String>();
	
	

	@Override
	public boolean checkFirstName(Customer customer) {
		if(customer.getFirstName().isEmpty()) {
			System.out.println("Bu Alana Bo� B�rak�lamaz  :"+customer.getFirstName());
		return false;
		}else {
			if(customer.getFirstName().length() < 6) {
				System.out.println("Bu Alan 5 Karakterden K���k Olamaz.. ");
			return false;
			}
		
	}return true;
	}

	@Override
	public boolean checkLastName(Customer customer) {
		if(customer.getLastName().isEmpty()) {
			System.out.println("Bu Alan Bo� B�rak�lamaz.." +customer.getLastName());
		return false;
		}else {
			if(customer.getLastName().length()<6) {
				System.out.println("Bu Alan 5 Karakterden K���k Olamaz.."+customer.getLastName());
				return false;
			}
		}return true;
		
	}

	@Override
	public boolean checkEmail(Customer customer) {
		String regex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
	            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
		Pattern pattern =Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		
		if(customer.geteMail().isEmpty()) {
			System.out.println("Email Alan� Bo� B�rak�lamaz..");
		
		return false;
		}else {
			if(customer.geteMail().isEmpty()==false)
			 {
				System.out.println("Girilen Mail Adresi Formata Uygun De�il..  �rnek: mail@mail.com");
				return false;
				
			}
		}return true;
		
	}

	
	

	@Override
	public boolean checkPassword(Customer customer) {
		if(customer.getPassword().isEmpty()) {
			System.out.println("Parola Bo� B�rak�lamaz..");
		return false;
		}else {
			if(customer.getPassword().length() < 9) {
				System.out.println("Parola 8 Karakterden K���k Olamaz..");
				return false;
			}
		}return true;
		
	}

	@Override
	public boolean uniqueEmail(Customer customer) {
		boolean result = true;
		if(listOfEmail.contains(customer.geteMail())) {
			System.out.println(customer.geteMail()+ ":Bu Mail Adresi Sisteme Kay�tl�d�r.." );
			result=false;
		}else {
			result=true;
			listOfEmail.add(customer.geteMail());
		}
		return result;
	}

	@Override
	public boolean isValid(Customer customer) {
		if(checkFirstName(customer)&& checkLastName(customer)&&checkEmail(customer)&& checkPassword(customer)&& uniqueEmail(customer)==true) {
			return true;
		}
		return false;
	}

}
