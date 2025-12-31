
import java.util.Scanner;
public class LuckyDraw{
  public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);
	char playChoice = 'y';
	
	// running the loop until the play choice is yes 
	while(playChoice == 'y' || playChoice =='Y')
	{
		// asking user if he wants to play
	   System.out.println("Do you want to play(Y/N)?");
	   playChoice = sc.next().charAt(0);
	   
	   // if user wants to play, then displaying if he wins a gift or not
	   if(playChoice == 'y' || playChoice == 'Y')
	   {
		   // user chooses any number
		    System.out.println("Choose any number");
			int choice = sc.nextInt();
			if(choice%3==0 && choice%5==0)
			{
				System.out.println("Congratulation! You win a gift");
			}
			else
			{
				System.out.println("Sorry! You donot win a gift");
			}
	   }
	   
	   // if user does not want to play, then stopping the loop
	   else
	   {
	       break;
	   }
	}
		
    sc.close();
	}
  }