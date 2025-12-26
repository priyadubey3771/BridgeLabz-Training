
import java.util.Scanner;
public class CoffeeCounter{

 public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        final double gstRate=0.05;

        while(true)
		{
            System.out.println("\nEnter coffee type (Espresso / Latte / Cappuccino) or type 'exit' to stop:");
            String coffeeType = scanner.nextLine().toLowerCase();
			if(coffeeType.equals("exit")) 
			{
                System.out.println("Thank you for visiting Ravi's Cafe!");
                break;
            }
			System.out.print("Enter quantity: ");
            int quantity= scanner.nextInt();
            scanner.nextLine(); 
			double pricePerCup;

            switch(coffeeType) 
			{
                case "espresso":
				{
                    pricePerCup = 120;
                    break;
				}
                case "latte":
				{
                    pricePerCup = 150;
                    break;
				}
                case "cappuccino":
				{
                    pricePerCup = 180;
                    break;
				}
                default:
				{
                    System.out.println("Invalid coffee type!");
                    continue;
				}
            }

            double totalPrice = pricePerCup * quantity;
            double gstAmount = totalPrice * gstRate;
            double finalBill = totalPrice + gstAmount;

            System.out.println("Total Price: Rs" + totalPrice);
            System.out.println("GST (5%): Rs" + gstAmount);
            System.out.println("Final Bill Amount: Rs" + finalBill);
        }
		scanner.close();
     }
   }
