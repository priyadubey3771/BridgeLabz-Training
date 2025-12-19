
import java.util.Scanner;
public class Power {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
   
		// taking number and power as the input from the user and declaring variable result
		int number,power,result=1;
		System.out.println("enter the number:");
		number = input.nextInt();
		System.out.println("enter the power:");
		power = input.nextInt();
   
		// checking if the number is positive and power is greater or equal to zero and displaying the power
		if(number>0 && power>=0)
		{
			 for(int i = 1; i<=power ; i++)
			 {
				result = result * number;
			 }
			 System.out.println(result);
		}
	    else
		{
			System.out.println("Invalid number");
		}
			
	  input.close();
	 }
    }