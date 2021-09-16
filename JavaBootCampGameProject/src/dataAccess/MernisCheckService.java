package dataAccess;

import java.rmi.RemoteException;

import business.abstracts.PersonCheckService;
import entities.concretes.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisCheckService implements PersonCheckService {
	KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
	@Override
	public boolean CheckIfRealPerson(User user) throws NumberFormatException, RemoteException {
		boolean result = kpsPublicSoapProxy.TCKimlikNoDogrula(user.getIdentityNo(),
				user.getFirstName(), user.getLastName(), user.getDateOfBirth());
		if(result == true) {
			System.out.println("Giri� Ba�ar�l�");
			return true;
		}else {
			System.out.println("Giri� Ba�ar�s�z..");
			
			return false;
		}
									
		
	}

}
