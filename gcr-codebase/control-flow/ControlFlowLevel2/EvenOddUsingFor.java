
import java.util.Scanner;
public class EvenOddUsingFor {
   public static void main (String[] args){
     Scanner input = new Scanner(System.in);
   
		// taking number as the input from the user
		int number;
		System.out.println("enter the number:");
		number = input.nextInt();
   
   
		// checking if the number is natural and displaying whether number is even or odd from 1 to that  number 
		if(number>0)
		{
				for(int i =1; i<=number ; i++)
			{
				if(i%2==0)
				{
					System.out.println(i + " is even \n");
				}
				else
				{
					System.out.println(i + " is odd \n");
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