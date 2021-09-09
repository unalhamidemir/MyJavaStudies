package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;
import jdk.jshell.spi.ExecutionControl.NotImplementedException;

public abstract class BaseCustomerManager implements ICustomerService {

	@Override
	public void Save(Customer customer) throws NotImplementedException, NumberFormatException, RemoteException {
		System.out.println("Saved to DB :"+customer.FirstName);
		
	}

}
