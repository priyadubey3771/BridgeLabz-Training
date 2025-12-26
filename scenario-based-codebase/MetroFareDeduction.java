
import java.util.Scanner;
public class MetroFareDeduction {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        System.out.println("Enter your initial Smart Card balance: ");
        double balance= sc.nextDouble();
		while(balance > 0) 
		{
            System.out.println("\nEnter distance to travel in km (or 0 to quit): ");
            double distance = sc.nextDouble();

            // Exit condition
            if (distance==0) 
			{
                System.out.println("Exiting... Remaining balance: Rs" + balance);
                break;
            }
			double fare= (distance <= 5) ? 10 :(distance <= 10) ? 20 : 30;
			if(fare > balance) 
			{
                System.out.println("Insufficient balance for this trip. Your balance: Rs" + balance);
            } 
			else 
			{
                balance -= fare;
                System.out.println("Fare Rs" + fare + " deducted. Remaining balance: Rs" + balance);
            }
			if (balance <= 0) 
			{
                System.out.println("Balance exhausted. Please recharge your smart card");
                break;
            }
        }

        sc.close();
     }
   }
