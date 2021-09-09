package Business.Abstracts;

import Entities.Concretes.Customer;

public interface CustomerService {
	
	void signUp(Customer customer);
	
	void signIn(Customer customer);
	

}
