
import java.util.Scanner;
public class Prime {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
   
		// taking number as the input from the user
		int number;
		System.out.println("enter the number:");
		number = input.nextInt();
        // declaring the boolean variable isPrime
        boolean isPrime = true;

         //checking if the number is prime or not
		if(number<=1)
		{
			isPrime=false;
		}
		else
		{
			for(int i=2;i<number;i++)
			{
				if(number%i==0)
				{
					isPrime=false;
					break;
				}
			}
		}
        // displaying the result
        if(isPrime)
		System.out.println("Number is a Prime Number");
		else
		System.out.println("Number is not a Prime Number");

		input.close();
	   }
		}

