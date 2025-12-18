
  import java.util.Scanner;
   public class Bonus {
   public static void main (String[] args){
   Scanner input = new Scanner(System.in);
   
   // taking salary and years as input from the user and declaring bonusAmount to calculate the bonus
   double salary, bonusAmount = 0;
   int years;
   System.out.println("enter the number of years:");
   years = input.nextInt();
   System.out.println("enter the salary:");
   salary = input.nextDouble();
   
   // checking whether the person is eligible for the bonus or not and calculating the bonus
      if(years>5)
	  {
	  bonusAmount = salary * 0.05;
	  }
	  System.out.println("The bonus amount is " + bonusAmount);
	  
	  input.close();
	 }
	 }