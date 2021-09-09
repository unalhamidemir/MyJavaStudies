package Concretes;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;
import jdk.jshell.spi.ExecutionControl.NotImplementedException;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private ICustomerCheckService _customerCheckService; 
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		_customerCheckService = customerCheckService;
	}
	
	@Override
	public void Save(Customer customer) throws NumberFormatException,RemoteException, NotImplementedException {
		if(ICustomerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}else {
			System.out.println("Hatalý Kullanýcý Girdiniz..");
		}
		
	}

	

	@SuppressWarnings("unused")
	private void CheckIfRealPerson(final Customer customer) {
		
		
	}

	public ICustomerCheckService get_customerCheckService() {
		return _customerCheckService;
	}

	public void set_customerCheckService(ICustomerCheckService _customerCheckService) {
		this._customerCheckService = _customerCheckService;
	}

}
