package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.User;

public interface GameSaleService {
	
	void sell(User user,Game game,Campaign campaign);

}
