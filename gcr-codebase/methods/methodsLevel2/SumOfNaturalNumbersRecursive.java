
import java.util.Scanner;
public class SumOfNaturalNumbersRecursive {

     //method to find the sum of natural numbers using recursion
    int recursiveSum(int n) 
	{
        if (n==0) 
		{
            return 0;
        }
        return n+recursiveSum(n - 1);
    }

    // method to find the sum of natural numbers using formula
    int formulaSum(int n) 
	{
        return n*(n+1)/2;
    }

  public static void main(String[] args) {
     Scanner input= new Scanner(System.in);
        // taking natural number as input from the user
        System.out.print("Enter a natural number: ");
        int n= input.nextInt();

        // comparing the result and displaying the output
        if (n<= 0) 
		{
            System.out.println("enter a valid natural number");
        }
		else 
		{
            SumOfNaturalNumbersRecursive sum = new SumOfNaturalNumbersRecursive();
            int sumByRecursion= sum.recursiveSum(n);
            int sumByFormula = sum.formulaSum(n);
			System.out.println("Sum using recursion:" + sumByRecursion);
            System.out.println("Sum using formula: " + sumByFormula);

            if (sumByRecursion== sumByFormula) 
			{
                System.out.println("Both results are correct and equal");
            } 
			else 
			{
                System.out.println("Results are not equal");
            }
        }
    input.close();
     }
   }
