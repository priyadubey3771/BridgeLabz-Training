
import java.util.Scanner;
public class FizzBuzz {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

        //taking number as the input from the user
		System.out.print("Enter a number:");
		int number= input.nextInt();

        // if less than or equal to 0 , then invalid number
		if(number<= 0)
		{
			System.out.println("Invalid input");
			input.close();
			return;
		}

        //creating string array of size number+1
		String[] result= new String[number+1];

         // checking if the number is fizz, buzz, fizzbuz or not
		for(int i=1; i<=number; i++)
		{
			if(i%3==0 && i%5==0)
			{
				result[i]= "FizzBuzz";
			}
			else if(i%3==0)
			{
				result[i]= "Fizz";
			}
			else if(i%5==0)
			{
				result[i]= "Buzz";
			}
		    else
			{
				result[i]= String.valueOf(i);
			}
		}

        //displaying the result
		for(int i=1; i<=number; i++)
		{
			System.out.println("Position "+i+ " = " +result[i]);
		}

		input.close();
		}
	}
