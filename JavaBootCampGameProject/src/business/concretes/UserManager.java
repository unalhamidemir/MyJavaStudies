package business.concretes;

import java.rmi.RemoteException;

import business.abstracts.PersonCheckService;
import business.abstracts.UserService;
import entities.concretes.User;

public class UserManager implements UserService{
	PersonCheckService personCheckService;
	public UserManager(PersonCheckService personCheckService) {
		this.personCheckService = personCheckService;
	}

	@Override
	public void add(User user) throws NumberFormatException, RemoteException {
		if(personCheckService.CheckIfRealPerson(user)) {
			System.out.println(user.getFirstName() + " " +user.getLastName() + " " + "Kayýt Baþarýlý..");
		}else {
			System.out.println(" Kayýt Mernis Sisteminde Mevcut Deðil..");
		}
		
	}

	@Override
	public void update(User user) throws NumberFormatException, RemoteException {
		System.out.println(user.getFirstName() + " " +user.getLastName() + " " + "Kayýt Güncellendi..");
		
	}

	@Override
	public void delete(User user) throws NumberFormatException, RemoteException {
		System.out.println(user.getFirstName() + " " +user.getLastName() + " " + "Kaydý silindi..");
		
	}

}
