
   import java.util.Scanner;
   public class FactorialUsingFor {
   public static void main (String[] args){
   Scanner input = new Scanner(System.in);
   
   //taking number as input from the user and declaring variable factorial to store the factorial of the number
   int number, factorial=1;
   System.out.println("enter the number:");
   number = input.nextInt();
   
   // calculating and displaying the factorial using for
     for(int i=number; i>1 ; i--)
     {
     factorial = factorial*i;
	 }
	 System.out.println("Factorial is " + factorial);
	 
	 input.close();
	 }
	 }
   