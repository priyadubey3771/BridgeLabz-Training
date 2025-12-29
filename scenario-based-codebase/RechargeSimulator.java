
import java.util.Scanner;
public class RechargeSimulator{
 public static void main(String[] args){
 
      Scanner sc = new Scanner(System.in);
	  char choice;
	  
	  do
	  {
	     // taking operator and amount as the input from the user
	     System.out.println("Enter the operator:");
		 String operator = sc.next();
		 System.out.println("Enter the amount:");
		 
		 // taking the amount user want to recharge
		 double amount = sc.nextDouble();
		 double balance = amount;
		 
		 // using switch to display offers
		 switch(operator.toLowerCase())
		 { 
		    case "airtel": 
			             {
						    System.out.println("Airtel Offer: 1.5GB/day for 28 days");
							break;
						 }
                case "vi":
			             {
						     System.out.println("VI Offer: Unlimited calls + 1GB/day");
							 break;
						 }
			    case "jio":
				         {
						     System.out.println("Jio Offer: 2GB/day for 28 days");
							 break;
					     }
				  default:
				         {
				             System.out.println("Invalid operator");
						 }
		}
		
		      //displaying the balance
			   System.out.println("Your balance is:" + balance);
			   System.out.println("Do you want to recharge again?(Y/N)");
			   choice = sc.next().charAt(0);
			   
		 }
		 while(choice=='y' || choice=='Y');
		 System.out.println("Thank you for doing phone recharge");
		 sc.close();
		}
	}