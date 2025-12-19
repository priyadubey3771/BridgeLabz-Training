
import java.util.Scanner;
public class AbundantNumber {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
   
		// taking number as the input from the user
		int number, sum=0;
		System.out.println("enter the number:");
		number = input.nextInt();

        //calculating the sum of divisors of the number
		for(int i=1; i<number; i++)
		{
			if(number%i ==0)
			{
				sum= sum+i;
			}
		}
		
        //displaying the output whether a number is abundant or not
		if(sum>number)
		{
		System.out.println("Abundant Number");
		}
		else
		{
		System.out.println("Not an Abundant Number");
		}

		input.close();
	}
		}
