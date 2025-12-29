
import java.util.Scanner;
import java.util.Random;
public class GuessNumber{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
	Random randomNumber = new Random();
	int numberToGuess = randomNumber.nextInt(100)+1;
	int attemptsUsed = 0;
	int totalAttempts = 5;
	int guess;
	System.out.println("Guess a random number between 1 and 100");
	
	 do
	 {      
	         // taking the choice as input from the user
		     System.out.println("Enter your choice:");
		     guess = sc.nextInt();
			 
			 // checking the conditions and displaying the result
			 if(guess>numberToGuess)
			 {
			       System.out.println("Too high");
				   attemptsUsed++;
				   
			 }
			 else if(guess<numberToGuess)
			 {
			       System.out.println("Too low");
				   attemptsUsed++;
			 }
			 if(numberToGuess==guess)
			 {
		          System.out.println("Your Guess is right");
				  break;
			 }
		     
	  }
	  while(attemptsUsed<totalAttempts);
	       
		   //if attempts over and unable to guess correct
		  if(guess!=numberToGuess)
		  {
		       System.out.println("Attempts over");
			   System.out.println("Correct answer was:" + numberToGuess);
		  }
		  sc.close();
		 }
	}
			   
  
      