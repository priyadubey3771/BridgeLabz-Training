
import java.util.Scanner;
public class MetroFareDeduction {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        // taking the initial balance of user as input
        System.out.println("Enter your initial Smart Card balance: ");
        double balance= sc.nextDouble();
		while(balance > 0) 
		{
			// taking the distance user want to travel as input or 0 to quit
            System.out.println("\nEnter distance to travel in km (or 0 to quit): ");
            double distance = sc.nextDouble();

            // Exit condition
            if (distance==0) 
			{
                System.out.println("Exiting... Remaining balance: Rs" + balance);
                break;
            }
			// calculating the fare according to the distance travelled
			double fare= (distance <= 5) ? 10 :(distance <= 10) ? 20 : 30;
			
			// if insufficient balance, then trip not possible
			if(fare > balance) 
			{
                System.out.println("Insufficient balance for this trip. Your balance: Rs" + balance);
            } 
			// if sufficient balance, then deducting fare amount from balance and showing remaining balance
			else 
			{
                balance -= fare;
                System.out.println("Fare Rs" + fare + " deducted. Remaining balance: Rs" + balance);
            }
			// if no remaining balance,then asking the user to recharge the smart card
			if (balance <= 0) 
			{
                System.out.println("Balance exhausted. Please recharge your smart card");
                break;
            }
        }

        sc.close();
     }
   }
