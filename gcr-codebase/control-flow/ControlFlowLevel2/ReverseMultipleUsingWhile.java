
import java.util.Scanner;
public class ReverseMultipleUsingWhile {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
   
		// taking number as the input from the user  and declaring the variable counter
		int number;
		System.out.println("enter the number:");
		number = input.nextInt();
		
		// checking if the number is positive and less than 100 and checking the multiples from 100 to 1 using while
		if(number>0 && number<100)
		{ 
	            int counter= number - 1;
			     while(counter > 1)
			    {
						if(number%counter==0)
						{
							System.out.println(counter);
						}
					
				  counter--;
			    }
		}
	    else
		{
			System.out.println("Invalid number");
		}
			
	  input.close();
	 }
    }