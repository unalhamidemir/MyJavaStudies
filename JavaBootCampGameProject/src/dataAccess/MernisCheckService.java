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
			System.out.println("Giriþ Baþarýlý");
			return true;
		}else {
			System.out.println("Giriþ Baþarýsýz..");
			
			return false;
		}
									
		
	}

}
