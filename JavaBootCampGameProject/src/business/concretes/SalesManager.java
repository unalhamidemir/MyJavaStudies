package business.concretes;

import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.User;

public class SalesManager {
	public void gameSales(User user, Game game,Campaign campaign) {
		String discountedPrice = user.getFirstName() +" "+user.getLastName() +" "+game.getName() + " " +"oyunu"
	+" " + "%" + campaign.getDiscount() +" "+"indirimle " +" "
				+(game.getPrice() - (game.getPrice() * campaign.getDiscount() / 100)) + " "
				+"Fiyatýyla satýn alýndý..";
		System.out.println(discountedPrice);
	}

}
