package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;
import jdk.jshell.spi.ExecutionControl.NotImplementedException;

public interface ICustomerService {
	
	void Save(Customer customer) throws NotImplementedException, NumberFormatException, RemoteException;
		

}
