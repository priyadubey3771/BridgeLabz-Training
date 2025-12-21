
import java.util.Scanner;
public class CalculateFactors {

     //method to find the factors and save them in an array
     static int[] findFactors(int number) 
	{
        int count = 0;
        for (int i=1; i<=number;i++) 
		{
            if (number%i ==0) 
			{
                count++;
            }
        }
		int[] factors =new int[count];
        int index = 0;
        for (int i= 1;i<= number;i++)
		{
            if (number%i== 0) 
			{
                factors[index]= i;
                index++;
            }
        }
		return factors;
	}
    // method to find the som of the factors
    public static int findSum(int[] factors) 
	{
        int sum= 0;
        for (int i=0; i<factors.length;i++)
		{
            sum= sum +factors[i];
        }
        return sum;
    }
     //method to find the product of the factor
    public static long findProduct(int[] factors) 
	{
        long product= 1;
        for (int i= 0;i< factors.length;i++) 
		{
            product= product*factors[i];
        }
        return product;
    }
    // method to find the sum of the square of the factors
    public static double findSumOfSquares(int[] factors) 
	{
        double sum= 0;
        for (int i= 0; i< factors.length;i++) 
		{
            sum= sum+ Math.pow(factors[i],2);
        }
        return sum;
    }

   public static void main(String[] args) {
     Scanner input =new Scanner(System.in);

       // taking number as user input 
        System.out.print("Enter a number:");
        int number= input.nextInt();

        // finding the factors of the number
        int[] factors= findFactors(number);
		System.out.println("Factors:");
        for (int i=0; i< factors.length; i++) 
		{
            System.out.print(factors[i] + " ");
        }
		//finding the sum, product, som of squares of the factors
        int sum= findSum(factors);
        long product= findProduct(factors);
        double sumOfSquares= findSumOfSquares(factors);

        // displaying the output
        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
        input.close();
     }
   }
