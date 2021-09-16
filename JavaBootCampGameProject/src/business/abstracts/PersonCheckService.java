package business.abstracts;

import java.rmi.RemoteException;

import entities.concretes.User;

public interface PersonCheckService {
	boolean CheckIfRealPerson(User user) throws NumberFormatException, RemoteException;

}
