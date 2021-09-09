import Concretes.GameSaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.setId(1);
		user.setFirstName("�NAL HAM�");
		user.setLastName("DEM�R");
		user.setNationalityId("56920496658");
		
		System.out.println("Kullan�c� �sim :" +user.getFirstName());
		System.out.println("Kullan�c� Soyisim :"+user.getLastName());
		System.out.println("Kullan�c� Tc Kimlik :" +user.getNationalityId());
		System.out.println("---------------------");
		
		Game game = new Game();
		game.setId(1);
		game.setGameName("PUBG");
		game.setCategoryName("Aksiyon");
		game.setPrice(1.200);
		System.out.println("Oyun Ad�:" +game.getGameName());
		System.out.println("Oyun Kategorisi :" +game.getCategoryName());
		System.out.println("Oyun �creti :" +game.getPrice());
		System.out.println("---------------------");
		
		Campaign campaign = new Campaign();
		campaign.setCampaignName("��renci");
		campaign.setDiscount(20);
		campaign.setStartDate(2021);
		campaign.setEndDate(2022);	
		System.out.println("Kampanya Ad� :" +campaign.getCampaignName());
		System.out.println("Kampanya Ba�lang�� :" +campaign.getStartDate());
		System.out.println("Kampanya Biti� :" +campaign.getEndDate());
		System.out.println("Kampanya �ndirimi Y�zde :"+campaign.getDiscount());
		System.out.println("---------------------------------");

	}

}
