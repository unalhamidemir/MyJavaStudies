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
			System.out.println(user.getFirstName() + " " +user.getLastName() + " " + "Kay�t Ba�ar�l�..");
		}else {
			System.out.println(" Kay�t Mernis Sisteminde Mevcut De�il..");
		}
		
	}

	@Override
	public void update(User user) throws NumberFormatException, RemoteException {
		System.out.println(user.getFirstName() + " " +user.getLastName() + " " + "Kay�t G�ncellendi..");
		
	}

	@Override
	public void delete(User user) throws NumberFormatException, RemoteException {
		System.out.println(user.getFirstName() + " " +user.getLastName() + " " + "Kayd� silindi..");
		
	}

}
