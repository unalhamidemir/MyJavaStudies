
package Entities;

public class Game {
	
	private int id;
	private String gameName;
	private String categoryName;
	private double price;
	
	
	public Game(int id, String gameName, String categoryName, double price) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.categoryName = categoryName;
		this.price = price;
	}


	public Game() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getGameName() {
		return gameName;
	}


	public void setGameName(String gameName) {
		this.gameName = gameName;
	}


	public String getCategoryName() {
		return categoryName;
	}


	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	

}
