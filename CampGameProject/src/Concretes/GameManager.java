package Concretes;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getCategoryName() +"Oyun Eklendi..");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getCategoryName() +"Oyun Güncellendi..");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getCategoryName() +"Oyun Silindi");
		
	}

}
