
import java.util.Scanner;
public class PowerUsingWhile {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
   
		// taking number and power as the input from the user and declaring variable result and counter
		int number,power,result=1,counter=0;
		System.out.println("enter the number:");
		number = input.nextInt();
		System.out.println("enter the power:");
		power = input.nextInt();
   
		// checking if the number is positive and power is greater or equal to zero and displaying the number after calculating power
		if(number>0 && power>=0)
		{
			 while(counter<power)
			 {
				result = result * number;
				counter++;
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