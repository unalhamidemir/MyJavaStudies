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
			System.out.println(user.getFirstName() +"Do�ru Kullan�c� Bilgileri..");
		}else {
			System.out.println(user.getFirstName() +"Yanl�� Kullan�c� Bilgileri..");
		}
		return result;
	}	 

}
