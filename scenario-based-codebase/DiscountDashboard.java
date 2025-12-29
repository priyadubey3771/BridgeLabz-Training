
import java.util.Scanner;
public class DiscountDashboard{
 public static void main(String[] args){
 
     Scanner sc = new Scanner(System.in);
	 int items;
	 
	 //taking number of items as input from the user
	 System.out.println("Enter the number of items:");
     items = sc.nextInt();
     double totalCost = 0.0;
	 
	 // declaring different discount for different prices
     double discount1= 0.10;	 
	 double discount2 = 0.20;
	 
	 //taking price of each item as input from the user
	 for(int i=0; i<items;i++)
	 {
	      System.out.println("enter the price of the item:");
		  double itemPrice = sc.nextDouble();
		  totalCost = totalCost + itemPrice;
	 }
	 
	 double discount =0;
	 
	  // calculating discount
	  if(totalCost>=500 && totalCost<1000)
	  {
	      discount = totalCost* discount1;
	  }
	  else if(totalCost>1000)
	  {
	       discount = totalCost* discount2;
	  }
	  else
	  {
	        discount =0;
	  }
		
		//displaying the total bill, discount and final amount to pay
		double finalAmount = totalCost - discount;
		System.out.println("Total bill is:" + totalCost);
		System.out.println("Discount is: Rs" + discount);
		System.out.println("Final amount to pay is: Rs" + finalAmount);
		
		sc.close();
   	}
  }
