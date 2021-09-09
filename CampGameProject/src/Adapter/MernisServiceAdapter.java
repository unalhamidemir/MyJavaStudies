package Adapter;

import java.rmi.RemoteException;

import Abstract.UserCheckService;
import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService{

	@Override
	public boolean CheckIfRealPerson(User user) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		boolean result =kpsPublic.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()),user.getFirstName().toUpperCase(),user.getLastName().toUpperCase(),user.getDateOfBirth().getYear());
		
		if(result==true) {
			System.out.println(user.getFirstName() +"Doðru Kullanýcý Bilgileri..");
		}else {
			System.out.println(user.getFirstName() +"Yanlýþ Kullanýcý Bilgileri..");
		}
		return result;
	}	 

}
