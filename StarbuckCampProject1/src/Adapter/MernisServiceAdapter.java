package Adapter;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;

import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{
	KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();

	public boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.Nationality›d), customer.FirstName.toUpperCase(), customer.LastName.toUpperCase(), customer.DateOfBirth);
													
		return false;
	}

	
	
	

}
