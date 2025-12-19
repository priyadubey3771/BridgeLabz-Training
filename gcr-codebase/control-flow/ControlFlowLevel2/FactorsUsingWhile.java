
import java.util.Scanner;
public class FactorsUsingWhile {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
   
		// taking number as the input from the user and creating the variable counter
		int number, counter=1;
		System.out.println("enter the number:");
		number = input.nextInt();
   
   
		// checking if the number is positive and checking and displaying the factors from 1 to that number
		if(number>0)
		{
			 while(counter<number)
			 {
			    if(number%counter==0)
				{
					System.out.println(counter);
			    }
				counter++;
			 }
		}
	    else
	    {
	      System.out.println(" number is invalid ");
	    }
	        
	  
	  input.close();
	 }
    }