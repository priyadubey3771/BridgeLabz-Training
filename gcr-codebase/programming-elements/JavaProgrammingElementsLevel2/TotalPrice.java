
import java.util.*;
public class TotalPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		//Taking the unit price and quantity as input from the user
        System.out.print("Enter the unit price (INR): ");
        double unitPrice = sc.nextDouble();
         System.out.print("Enter the quantity: ");
        int quantity = sc.nextInt();
		
		//calculating the total price
        double totalPrice = unitPrice * quantity;
		
		//Displaying the total price
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }
}