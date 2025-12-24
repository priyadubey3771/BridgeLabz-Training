
import java.util.Scanner;
public class FactorialUsingRecursion{

    // Method to take input from user
    static int takeInput(Scanner sc)
    {
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }
	// Recursive method to calculate factorial
    static long factorial(int number)
    {
        if(number==0 || number==1)
        {
            return 1;
        }
        return number*factorial(number-1);
    }
	// Method to display result
    static void displayResult(int number,long result)
    {
        System.out.println("Factorial of " +number+" is: "+result);
    }
public static void main(String[] args){
   Scanner sc= new Scanner(System.in);

        int number= takeInput(sc);
		if(number< 0)
        {
            System.out.println("Factorial is not defined for negative numbers");
        }
        else
        {
            long result= factorial(number);
            displayResult(number,result);
        }
     }
  }
