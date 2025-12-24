
import java.util.Scanner;
public class NumberGuessingGame{

    // Method to generate computer guess between given range
    static int generateGuess(int low, int high)
    {
        return low + (int)(Math.random() * (high-low+1));
    }
	// Method to get user feedback
    static String getUserFeedback(Scanner sc)
    {
        System.out.print("Enter feedback (high / low / correct): ");
        return sc.next().toLowerCase();
    }
	// Method to adjust range based on feedback
    static int[] updateRange(int low, int high, int guess, String feedback)
    {
        if(feedback.equals("high"))
        {
            high= guess - 1;
        }
        else if(feedback.equals("low"))
        {
            low= guess + 1;
        }
        int[] range= {low, high};
        return range;
    }

public static void main(String[] args){
  Scanner sc = new Scanner(System.in);

        System.out.println("Think of a number between 1 and 100");
        System.out.println("Computer will try to guess it\n");

        int low= 1;
        int high= 100;
        int attempts= 0;
		while(true)
        {
            int guess= generateGuess(low,high);
            attempts++;
			System.out.println("Computer guess: " + guess);
			String feedback = getUserFeedback(sc);

            if(feedback.equals("correct"))
            {
                System.out.println("\nComputer guessed the number correctly!");
                System.out.println("Total attempts: " + attempts);
                break;
            }
            else if(feedback.equals("high") || feedback.equals("low"))
            {
                int[] range= updateRange(low, high, guess, feedback);
                low= range[0];
                high= range[1];
            }
            else
            {
                System.out.println("Invalid feedback. Please enter high, low, or correct.");
                attempts--;
            }
         }
     }
  }
