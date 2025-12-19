
import java.util.Scanner;
public class SumAndStore {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		
      // taking the array of size 10 for double data type and declaring total and index
		double[] numbers=new double[10];
		double total= 0.0;
		int index= 0;

       //using infinite while loop 
		while(true)
		{
			System.out.print("Enter a number:");
			double value=input.nextDouble();
            
			// breaking the loop if user enters 0 or less than 0 and if index is equal to 10
			if(value <=0)
			{
				break;
			}

			if(index == 10)
            {
				break;
			}
            // storing values in array numbers until index is 10
			numbers[index]= value;
			index++;
		}

         //displaying the numbers and the total of all the numbers
		for(int i=0;i< index; i++)
		{
			System.out.println(numbers[i]);
			total= total+numbers[i];
		}

			System.out.println("Sum of all numbers:"+ total);

			input.close();
		}
	}
