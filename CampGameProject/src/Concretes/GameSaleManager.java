package Concretes;

import Abstract.GameSaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class GameSaleManager implements GameSaleService {
	
	public void sell(User user, Game game, Campaign campaign) {
		double lastprice = game.getPrice() - (game.getPrice()*campaign.getDiscount()/100);
		
		System.out.println(user.getFirstName() +"�simli Kullan�c�ya " +game.getPrice() +"Tutar�ndaki " +game.getGameName()+"�simli Oyun " + campaign.getDiscount() +"�ndirimiyle " + lastprice + "Fiyat�yla Sat�lm��t�r.");
	}
	

}
