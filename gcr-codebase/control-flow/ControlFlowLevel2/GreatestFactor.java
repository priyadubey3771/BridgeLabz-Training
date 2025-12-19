
import java.util.Scanner;
public class GreatestFactor {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
   
		// taking number as the input from the user and creating the variable greatestFactor
		int number, greatestFactor=1;
		System.out.println("enter the number:");
		number = input.nextInt();
   
   
		// checking if the number is positive and calculating the greatest factor
		if(number>0)
		{
			 for(int i = number-1; i>=1; i--)
			 { 
					if(number%i==0)
					{
						greatestFactor = i;
						break;
					}
			 }
			 System.out.println("Greatest factor is " + greatestFactor);
		}
	    else
		{
			System.out.println("Invalid number");
		}
			
	  input.close();
	 }
    }