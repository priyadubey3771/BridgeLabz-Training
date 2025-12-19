
import java.util.Scanner;
public class GreatestFactorUsingWhile {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
   
		// taking number as the input from the user and creating the variable greatestFactor
		int number, greatestFactor=1 ,counter;
		System.out.println("enter the number:");
		number = input.nextInt();
        counter = number - 1;
   
		// checking if the number is positive and calculating the greatest factor using while loop
		if(number>0)
		{
			 while(counter>=1)
			 { 
					if(number%counter==0)
					{
						greatestFactor = counter;
						break;
					}
					counter--;
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