package business.concretes;

import business.abstracts.GameService;
import entities.concretes.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+" "+game.getPrice()+" "+"Ücretiyle Eklendi..");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+" "+"Oyun Bilgileri Güncellendi...");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+" "+"Sistemden Silindi..");
		
	}

}
