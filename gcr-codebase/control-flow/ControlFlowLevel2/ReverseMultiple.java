
import java.util.Scanner;
public class ReverseMultiple {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
   
		// taking number as the input from the user 
		int number;
		System.out.println("enter the number:");
		number = input.nextInt();
   
		// checking if the number is positive and less than 100 and checking the multiples from 100 to 1
		if(number>0 && number<100)
		{
			 for(int i = 100; i>=1 ; i--)
			  {
					if(i%number==0)
					{
						System.out.println(i);
					}
				}
			 
		}
	    else
		{
			System.out.println("Invalid number");
		}
			
	  input.close();
	 }
    }