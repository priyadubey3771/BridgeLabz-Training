//creating class DiscountedFee to calculate the discounted fees
public class DiscountedFee {
   public static void main (String args[]) {
   
   //creating variables to store fee, discount percent and discount  
   int Fee = 125000 ;
   int DiscountPercent = 10 ;
   int Discount = Fee * (DiscountPercent/100) ;
   
   //Displaying the discount amount and discounted fees
   System.out.println("The discount amount is INR " +Discount +" and final discounted fee is INR " +(Fee - Discount)) ;
   }
}