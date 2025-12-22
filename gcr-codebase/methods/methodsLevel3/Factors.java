
import java.util.Scanner;
public class Factors {

    //Method to find all factors of a number and return as array
    public static int[] findFactors(int number) 
	{
        int count= 0;
		for (int i=1; i<=number;i++) 
		{
            if (number%i== 0) 
			{
                count++;
            }
        }
		int[] factors= new int[count];
        int index= 0;
		for (int i=1; i<=number; i++) 
		{
            if (number%i == 0) 
			{
                factors[index]= i;
                index++;
            }
        }

        return factors;
    }
	//Method to find the greatest factor
	public static int greatestFactor(int[] factors) 
	{
        int max = factors[0];
		for (int i=1; i< factors.length; i++) 
		{
            if (factors[i]> max)
			{
                max= factors[i];
            }
        }

        return max;
    }
     //Method to find sum of factors
    public static int sumOfFactors(int[] factors) 
	{
        int sum = 0;
		for (int i= 0; i< factors.length;i++) 
		{
            sum= sum+factors[i];
        }
		return sum;
    }
     //Method to find product of factors
    public static long productOfFactors(int[] factors) 
	{
        long product = 1;
		for (int i =0; i< factors.length; i++) 
		{
            product= product*factors[i];
        }
        return product;
    }
     //Method to find product of cube of factors
    public static long productOfCubes(int[] factors) 
	{
        long product = 1;
		for (int i = 0; i < factors.length; i++) 
		{
            product= product* (long)Math.pow(factors[i],3);
        }
		return product;
    }

   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

        //Taking number input
        System.out.print("Enter a number: ");
        int number=input.nextInt();
        int[] factors= findFactors(number);
		
		//Displaying factors
		System.out.println("Factors of the number:");
        for (int i =0; i< factors.length; i++) 
		{
            System.out.print(factors[i] + " ");
        }
		//Displaying results
		System.out.println("Greatest factor: " + greatestFactor(factors));
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Product of cubes of factors: " + productOfCubes(factors));

        input.close();
     }
   }
