import java.util.* ;
//creating a class DiscountOnFeesWithInputs to calculate the discounted fees
public class DiscountOnFeesWithInputs {
   public static void main (String args[]) {
   Scanner input = new Scanner(System.in) ;
   //create variables to store fee, discount percent and discount  
   int Fee ;
   int DiscountPercent   ;
   int Discount;
   
       //Taking user input for the fee and discount
   System.out.println("Enter the fee") ;
   Fee = input.nextInt() ;
   System.out.println("Enter the discountPercent") ;
   DiscountPercent = input.nextInt() ;
   Discount = Fee * (DiscountPercent/100) ;
   
         //Displaying the discounted amount and discounted fees
   System.out.println("The discount amount is INR " +Discount +" and final discounted fee is INR " +(Fee - Discount)) ;
   }
}