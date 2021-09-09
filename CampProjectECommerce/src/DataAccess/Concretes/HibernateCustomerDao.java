package DataAccess.Concretes;

import java.util.ArrayList;
import java.util.List;

import DataAccess.Abstracts.CustomerDao;
import Entities.Concretes.Customer;

public class HibernateCustomerDao implements CustomerDao {
	
	List<Customer> customer = new ArrayList<Customer>();
	private String password;

	@Override
	public void add(Customer customer) {
		customer.add(customer);
		
	}

	@Override
	public void update(Customer customer) {
		customer.update(customer);
		
	}

	@Override
	public void delete(Customer customer) {
		customer.delete(customer);
		
	}

	@Override
	public boolean getEmail(String email) {
		for(Customer customer : customer) {
			if(customer.geteMail()==email) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean getPassword(String email) {
		for(Customer customer : customer) {
			if(customer.getPassword()==password) 
			{
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
