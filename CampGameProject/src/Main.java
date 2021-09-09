import Concretes.GameSaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.setId(1);
		user.setFirstName("ÜNAL HAMÝ");
		user.setLastName("DEMÝR");
		user.setNationalityId("56920496658");
		
		System.out.println("Kullanýcý Ýsim :" +user.getFirstName());
		System.out.println("Kullanýcý Soyisim :"+user.getLastName());
		System.out.println("Kullanýcý Tc Kimlik :" +user.getNationalityId());
		System.out.println("---------------------");
		
		Game game = new Game();
		game.setId(1);
		game.setGameName("PUBG");
		game.setCategoryName("Aksiyon");
		game.setPrice(1.200);
		System.out.println("Oyun Adý:" +game.getGameName());
		System.out.println("Oyun Kategorisi :" +game.getCategoryName());
		System.out.println("Oyun Ücreti :" +game.getPrice());
		System.out.println("---------------------");
		
		Campaign campaign = new Campaign();
		campaign.setCampaignName("Öðrenci");
		campaign.setDiscount(20);
		campaign.setStartDate(2021);
		campaign.setEndDate(2022);	
		System.out.println("Kampanya Adý :" +campaign.getCampaignName());
		System.out.println("Kampanya Baþlangýç :" +campaign.getStartDate());
		System.out.println("Kampanya Bitiþ :" +campaign.getEndDate());
		System.out.println("Kampanya Ýndirimi Yüzde :"+campaign.getDiscount());
		System.out.println("---------------------------------");

	}

}
