
import java.util.Scanner;
public class FizzBuzz {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
   
		// taking number as the input from the user
		int number;
		System.out.println("enter the number:");
		number = input.nextInt();
   
   
		// checking if the number is positive and checking if the number is Fizz, Buzz or FizzBuzz or none of them
		if(number>0)
		{
			for(int i = number; i>=1 ; i--)
			{
				if(i%3==0 && i%5!=0)
				{
					System.out.println("Fizz");
				}
				else if(i%5==0 && i%3!=0)
				{
					System.out.println("Buzz");
				}
				else if(i%3==0 && i%5==0)
				{
				System.out.println("FizzBuzz");
				}
				else
				{
				System.out.println(i);
				}
			}  
	       
		}
	   else
	   {
	      System.out.println(" number is invalid ");
	   }
	        
	  
	  input.close();
	 }
    }