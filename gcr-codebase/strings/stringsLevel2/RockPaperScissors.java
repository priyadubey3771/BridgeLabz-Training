
import java.util.Scanner;
public class RockPaperScissors{

    // Method to generate computer choice
    static String getComputerChoice() 
	{
        int choice= (int) (Math.random()*3);
		if(choice == 0)
		{
		  return "rock";
	    }
        else if(choice == 1)
		{
            return "paper";
		}
        else
		{
            return "scissors";
		}
    }
	// Method to find the winner
    static String findWinner(String user,String computer) 
	{
		if(user.equals(computer))
		{
            return "Draw";
		}
		if(user.equals("rock") && computer.equals("scissors"))
		{
            return "User";
		}
        if(user.equals("rock") && computer.equals("paper"))
		{
            return "Computer";
		}
		if(user.equals("paper") && computer.equals("rock"))
		{
            return "User";
		}
        if(user.equals("paper") && computer.equals("scissors"))
		{
            return "Computer";
		}
		if(user.equals("scissors") && computer.equals("paper"))
		{
            return "User";
		}
        if(user.equals("scissors") && computer.equals("rock"))
		{
            return "Computer";
		}
		return "Invalid";
    }
	// Method to calculate average and percentage
    static String[][] calculateStats(int userWins,int computerWins,int totalGames) 
	{
		String[][] stats= new String[2][3];
		double userPercentage= (userWins*100.0)/totalGames;
        double computerPercentage= (computerWins*100.0)/totalGames;
		stats[0][0]="User";
        stats[0][1]=String.valueOf(userWins);
        stats[0][2]= String.format("%.2f", userPercentage);
		stats[1][0]= "Computer";
        stats[1][1]=String.valueOf(computerWins);
        stats[1][2]=String.format("%.2f", computerPercentage);

        return stats;
    }
	// Method to display game results and statistics
    static void displayResults(String[][] games,String[][] stats) 
	{
		System.out.println("\nGame Results:");
        System.out.println("Game\tUser\tComputer\tWinner");
        System.out.println(" ");
		for (int i=0;i<games.length;i++) 
		{
            System.out.println((i+1)+"\t"+games[i][0]+"\t"+games[i][1]+"\t\t"+games[i][2]);
        }
		System.out.println("\nWin Statistics:");
        System.out.println("Player\tWins\tWinning%");
        System.out.println(" ");
		for (int i=0;i<stats.length;i++) 
		{
            System.out.println(stats[i][0]+"\t"+stats[i][1]+"\t"+stats[i][2]);
        }
    }

public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int gamesCount= sc.nextInt();
		String[][] gameResults= new String[gamesCount][3];
		int userWins= 0;
        int computerWins= 0;

        for (int i=0;i<gamesCount;i++) 
		{
			System.out.print("\nGame " + (i+1)+ " - Enter your choice(rock/paper/scissors): ");
            String userChoice= sc.next().toLowerCase();
			String computerChoice= getComputerChoice();
            String winner= findWinner(userChoice,computerChoice);

            if(winner.equals("User"))
			{
                userWins++;
			}
            else if(winner.equals("Computer"))
			{
                computerWins++;
			}
			gameResults[i][0]= userChoice;
            gameResults[i][1]= computerChoice;
            gameResults[i][2]= winner;
        }
		String[][] stats= calculateStats(userWins,computerWins,gamesCount);
		displayResults(gameResults, stats);
     }
   }
