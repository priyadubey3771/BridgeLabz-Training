package gamebox;

public class GameBoxDriver {
  public static void main(String[] args) {

	User user = new User("Priya");
	Game game1 = new ArcadeGame("Speed Rush", 299, 4.5);
	Game game2 = new StrategyGame("War Tactix", 499, 4.7);
	
	game1.playDemo();
	game2.playDemo();
	// seasonal discount
	game2.applyDiscount(20);
	
	user.purchaseGame(game1);
	user.purchaseGame(game2);
	user.showLibrary();
	
  }
}
