
import java.util.Scanner;
public class Factors {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
   
		// taking number as the input from the user
		int number;
		System.out.println("enter the number:");
		number = input.nextInt();
   
   
		// checking if the number is positive and checking for the factors from 1 to that number
		if(number>0)
		{
			   for(int i = 1; i<=number; i++)
			{
				if(number%i==0)
				{
					System.out.println(i);
				}
				else
				{
					continue;
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