package Abstract;

import java.rmi.RemoteException;

import Entities.User;

public interface UserCheckService {

	boolean CheckIfRealPerson(User user)throws NumberFormatException,RemoteException;

}
