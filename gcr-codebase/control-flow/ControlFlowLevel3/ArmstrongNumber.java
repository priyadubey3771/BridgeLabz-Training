
import java.util.Scanner;
public class ArmstrongNumber {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
   
		// taking number as the input from the user
		int number, sum=0;
		System.out.println("enter the number:");
		number = input.nextInt();
        int originalNumber=number;

         //checking if the number is armstrong or not and displaying the output
		 while(originalNumber!=0)
		{
			int remainder = originalNumber %10;
			sum = sum +(remainder*remainder*remainder);
			originalNumber = originalNumber/10;
		}
		if(sum==number)
		{
			System.out.println("Number is an Armstrong Number");
		}
		else
		{
			System.out.println("Number is not an Armstrong Number");
		}
       
	   input.close();
	}
   }
