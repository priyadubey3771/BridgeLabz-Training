
import java.util.Scanner;
public class NumberOfDigits {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
   
		// taking number as the input from the user
		int number, count=0;
		System.out.println("enter the number:");
		number = input.nextInt();

        // calculating the numbers of digits in a number
        while(number!=0)
        {
			number=number/10;
			count++;
	    }
        //displaying the result
		System.out.println("Number of digits is " + count);

		input.close();
		}
	}
