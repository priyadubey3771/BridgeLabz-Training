package gamebox;

import java.util.ArrayList;
import java.util.List;

// represents a gamebox user
public class User {

    private String username;
    private List<Game> ownedGames;

    public User(String username) 
    {
        this.username = username;
        this.ownedGames = new ArrayList<>();
    }

    // controlled access to owned games
    public void purchaseGame(Game game) 
    {
        ownedGames.add(game);
        System.out.println(game.getTitle() + " added to library.");
    }

    public void showLibrary() 
    {
        System.out.println("\n" + username + "'s Game Library:");
        for (Game g : ownedGames) 
        {
            System.out.println("- " + g.getTitle() + " | Price: " + g.getPrice());
        }
    }
}
