
import java.util.Scanner;
public class DeckOfCards{

    // Method to initialize the deck of cards
    static String[] initializeDeck(String[] suits,String[] ranks)
    {
        int numOfCards=suits.length*ranks.length;
        String[] deck=new String[numOfCards];
        int index=0;
		for(int i=0;i<suits.length;i++)
        {
            for(int j=0;j<ranks.length;j++)
            {
                deck[index]= ranks[j]+" of "+suits[i];
                index++;
            }
        }
        return deck;
    }
	// Method to shuffle the deck of cards
    static String[] shuffleDeck(String[] deck)
    {
        int n=deck.length;
		for(int i=0;i<n;i++)
        {
            int randomCardNumber=i+(int)(Math.random()*(n-i));
			String temp=deck[i];
            deck[i]=deck[randomCardNumber];
            deck[randomCardNumber]=temp;
        }
        return deck;
    }
	// Method to distribute cards to players
    static String[][] distributeCards(String[] deck,int players,int cardsPerPlayer)
    {
        int totalCardsNeeded=players*cardsPerPlayer;
		if(totalCardsNeeded>deck.length)
        {
            return null;
        }
		String[][] distributedCards=new String[players][cardsPerPlayer];
        int index= 0;
		for(int i=0;i<players;i++)
        {
            for(int j=0;j<cardsPerPlayer;j++)
            {
                distributedCards[i][j]=deck[index];
                index++;
            }
        }
        return distributedCards;
    }
	// Method to print players and their cards
    static void printPlayersCards(String[][] playersCards)
    {
        for(int i=0;i<playersCards.length;i++)
        {
            System.out.println("\nPlayer " +(i+1)+" cards:");
            for(int j=0;j<playersCards[i].length;j++)
            {
                System.out.println(playersCards[i][j]);
            }
        }
    }

public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String[] suits={"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks={"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};
		String[] deck=initializeDeck(suits,ranks);
        deck=shuffleDeck(deck);
		System.out.print("Enter number of players: ");
        int players=sc.nextInt();
		System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer= sc.nextInt();
		String[][] playersCards=distributeCards(deck, players, cardsPerPlayer);
		
		if(playersCards==null)
        {
            System.out.println("Cards cannot be distributed to players");
        }
        else
        {
            printPlayersCards(playersCards);
        }
     }
   }
