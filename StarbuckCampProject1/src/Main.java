import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
import Concretes.StarbucksCustomerManager;
import Entities.Customer;
import jdk.jshell.spi.ExecutionControl.NotImplementedException;

public class Main {

	public static void main(String[] args) throws NotImplementedException, NumberFormatException, RemoteException {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer(1, "Ünal", "Demir", 1992, "56920496652"));
				

	}

} 
