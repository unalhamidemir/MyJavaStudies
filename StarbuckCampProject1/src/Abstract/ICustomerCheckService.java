package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;

	public interface ICustomerCheckService {
	
		public static boolean CheckIfRealPerson(Customer customer)throws NumberFormatException,RemoteException {
			return true;
		}
		
		
	}           


