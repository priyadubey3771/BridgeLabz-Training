
import java.util.Scanner;
public class FizzBuzzUsingWhile {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
   
		// taking number as the input from the user
		int number;
		System.out.println("enter the number:");
		number = input.nextInt();
   
   
		// checking if the number is positive and checking if the number is Fizz, Buzz or FizzBuzz or none of them using while
		if(number>0)
		{
			while(number>=1)
			{
				if(number%3==0 && number%5!=0)
				{
					System.out.println("Fizz");
				}
				else if(number%5==0 && number%3!=0)
				{
					System.out.println("Buzz");
				}
				else if(number%3==0 && number%5==0)
				{
				System.out.println("FizzBuzz");
				}
				else
				{
				System.out.println(number);
				}
				
				number--;
			}  
	       
		}
	   else
	   {
	      System.out.println(" number is invalid ");
	   }
	        
	  
	  input.close();
	 }
    }