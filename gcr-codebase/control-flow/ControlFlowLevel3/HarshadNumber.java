
import java.util.Scanner;
public class HarshadNumber {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
   
		// taking number as the input from the user
		int number, sum=0;
		System.out.println("enter the number:");
		number = input.nextInt();
        int originalNumber= number;

        //checking whether the number is Harshad or not
		while(originalNumber!=0)
		{
			int remainder= originalNumber%10;
			sum= sum +remainder;
			originalNumber = originalNumber/10;
		}
		
		//displaying the output
        if(number%sum==0)
		{
		System.out.println("Harshad Number");
		}
		else
		{
		System.out.println("Not a Harshad Number");
		}
        input.close();
		}
	}
