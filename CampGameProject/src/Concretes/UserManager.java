package Concretes;

import java.rmi.RemoteException;

import Abstract.UserCheckService;
import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService{
	
	UserCheckService userCheckService;
	
	
	public UserManager(UserCheckService userCheckService) {
		this.userCheckService=userCheckService;
		
	}
	@Override
	public void add(User user)throws NumberFormatException,RemoteException{
		
		if(userCheckService.CheckIfRealPerson(user)) {
			System.out.println(user.getFirstName() + "Ýsimli Kullanýcý Sisteme Eklendi..");
			
		}else {
			System.out.println("Hatalý Bilgi Kullanýcý Eklenemedi..");
		}
	}
	
	@Override
	public void update(User user) throws NumberFormatException,RemoteException{
		if(userCheckService.CheckIfRealPerson(user)) {
			System.out.println(user.getFirstName() + "Ýsimli Kullanýcý Güncellendi..");
		}else {
			
			System.out.println("Hatalý Bilgi Kullanýcý Güncellenemedi..");
		}
	}
	
	
	@Override
	public void delete(User user) throws NumberFormatException,RemoteException{
		
		if(userCheckService.CheckIfRealPerson(user)) {
			System.out.println(user.getFirstName() + "Ýsimli Kullanýcý Silindi...");
		}else {
			System.out.println("Hatalý Bilgi Kullanýcý Silinemedi..");
		}
	}
}