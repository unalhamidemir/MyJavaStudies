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
			System.out.println(user.getFirstName() + "�simli Kullan�c� Sisteme Eklendi..");
			
		}else {
			System.out.println("Hatal� Bilgi Kullan�c� Eklenemedi..");
		}
	}
	
	@Override
	public void update(User user) throws NumberFormatException,RemoteException{
		if(userCheckService.CheckIfRealPerson(user)) {
			System.out.println(user.getFirstName() + "�simli Kullan�c� G�ncellendi..");
		}else {
			
			System.out.println("Hatal� Bilgi Kullan�c� G�ncellenemedi..");
		}
	}
	
	
	@Override
	public void delete(User user) throws NumberFormatException,RemoteException{
		
		if(userCheckService.CheckIfRealPerson(user)) {
			System.out.println(user.getFirstName() + "�simli Kullan�c� Silindi...");
		}else {
			System.out.println("Hatal� Bilgi Kullan�c� Silinemedi..");
		}
	}
}