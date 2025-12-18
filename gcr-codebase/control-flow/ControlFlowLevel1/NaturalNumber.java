
 import java.util.Scanner;
   public class NaturalNumber {
   public static void main (String[] args){
   Scanner input = new Scanner(System.in);
   
   // declaring the variable number to take the input from the user and variable sum to calculate the sum of natural numbers
   int number, sum;
   System.out.println("enter the number:");
   number = input.nextInt();
   
   
    //checking if the number is natural or not and printing  the sum of n natural numbers
     if(number>0)
     {
     sum = number * (number+1)/2;
	 System.out.println("Sum of " + number + " natural numbers is "+ sum);
	 }
	 else 
	 System.out.println("The number " + number + " is not a natural number");
	 
	 input.close();
	 }
	 }
   
   