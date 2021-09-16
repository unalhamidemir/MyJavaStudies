import java.rmi.RemoteException;

import business.concretes.CampaignManager;
import business.concretes.GameManager;
import business.concretes.SalesManager;
import business.concretes.UserManager;
import dataAccess.MernisCheckService;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) throws NumberFormatException,RemoteException{
		User user = new User(1, "ÜNAL", "DEMÝR", 1998, "56920563353");
		
		Game game1 = new Game(1, "Counter Strike", 20);
		Campaign campaign = new Campaign(1, "Öðrenci Ýndirimi", 50);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		
		CampaignManager campaignManager= new CampaignManager();
		campaignManager.add(campaign);
		
		SalesManager salesManager = new SalesManager();
		salesManager.gameSales(user, game1, campaign);
		
		UserManager userManager = new UserManager(new MernisCheckService());
		userManager.add(user);
		

	}

}
