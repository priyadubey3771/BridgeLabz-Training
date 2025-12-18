
   import java.util.Scanner;
   public class Factorial {
   public static void main (String[] args){
   Scanner input = new Scanner(System.in);
   
   // taking number as input from the user and declaring variable factorial to store the factorial of the number
   int number, factorial=1;
   System.out.println("enter the number:");
   number = input.nextInt();
   
   // calculating and displaying the factorial
     while(number>1)
     {
     factorial = factorial*number;
	 number--;
	 }
	 System.out.println("Factorial is " + factorial);
	 
	 input.close();
	 }
	 }
   