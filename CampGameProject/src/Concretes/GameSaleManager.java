package Concretes;

import Abstract.GameSaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class GameSaleManager implements GameSaleService {
	
	public void sell(User user, Game game, Campaign campaign) {
		double lastprice = game.getPrice() - (game.getPrice()*campaign.getDiscount()/100);
		
		System.out.println(user.getFirstName() +"Ýsimli Kullanýcýya " +game.getPrice() +"Tutarýndaki " +game.getGameName()+"Ýsimli Oyun " + campaign.getDiscount() +"Ýndirimiyle " + lastprice + "Fiyatýyla Satýlmýþtýr.");
	}
	

}
