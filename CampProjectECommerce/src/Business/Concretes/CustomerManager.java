package Business.Concretes;

import Business.Abstracts.CustomerCheckService;
import Business.Abstracts.CustomerService;
import Business.Abstracts.VerificationService;
import DataAccess.Abstracts.CustomerDao;
import Entities.Concretes.Customer;

public class CustomerManager implements CustomerService{
	
	CustomerCheckService CustomerCheckService;
	VerificationService VerificationService;
	CustomerDao CustomerDao;
	
	public CustomerManager(
			CustomerCheckService customerCheckService,
			VerificationService verificationService,
			CustomerDao customerDao) {
		this.CustomerCheckService = customerCheckService;
		this.VerificationService = verificationService;
		this.CustomerDao = customerDao;
	}
		
	
	
	

	@Override
	public void signUp(Customer customer) {
		if(CustomerCheckService.isValid(customer)==true) {
			System.out.println(customer.getFirstName() + "Kullanýcý Eklendi..");
			VerificationService.sendVerifyEmail(customer.geteMail());
			CustomerDao.add(customer);
		}
		
	}

	@Override
	public void signIn(Customer customer) {
		VerificationService.verifyMail(customer.geteMail());
			if(CustomerDao.getEmail(customer.geteMail()) && CustomerDao.getPassword(customer.getPassword())
				&&VerificationService.checkVerifyAccount(customer.geteMail())==true){
					System.out.println("Giriþ Baþarýlý..");
				}else if (VerificationService.checkVerifyAccount(customer.geteMail())==false) {
					System.out.println("Mail Adresi Doðrulanmadýðý Ýçin Giriþ Yapýlamýyor...");
					
				}else {
					System.out.println("Girilen Bilgiler Yanlýþ,Bilgilerinizi Kontrol ediniz");
				}
	}

}
