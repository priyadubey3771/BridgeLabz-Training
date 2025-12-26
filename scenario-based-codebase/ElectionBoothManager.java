
import java.util.Scanner;
public class ElectionBoothManager{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	
        int candidate1Votes= 0;
        int candidate2Votes= 0;
        int candidate3Votes= 0;

        while(true) 
		{
            System.out.println("Enter your age (or -1 to exit): ");
            int age = sc.nextInt();

            // Exit condition
            if(age == -1) 
			{
                break;
            }

            // Checking eligibility
            if (age>=18) 
			{
                System.out.println("You are eligible to vote!");
                System.out.println("Vote for a candidate (1, 2, or 3): ");
                int vote = sc.nextInt();

                // Record vote
                if(vote==1) 
				{
                    candidate1Votes++;
                } 
				else if(vote==2) 
				{
                    candidate2Votes++;
                } 
				else if(vote==3) 
				{
                    candidate3Votes++;
                } 
				else 
				{
                    System.out.println("Invalid vote. Try again.");
                }
            } 
			else 
			{
                System.out.println("Sorry, you are not eligible to vote.");
            }

            System.out.println(); 
        }

        // Displaying final results
        System.out.println("Voting ended. Results:");
        System.out.println("Candidate 1: " + candidate1Votes + " votes");
        System.out.println("Candidate 2: " + candidate2Votes + " votes");
        System.out.println("Candidate 3: " + candidate3Votes + " votes");

        sc.close();
     }
  }
