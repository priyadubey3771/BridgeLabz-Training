
import java.util.Scanner;
public class LargestSecondLargestDigit {
 public static void main (String[] args){
	Scanner input = new Scanner(System.in);

       //taking number as the input from the user
       	System.out.print("Enter a number:");
		int number= input.nextInt();

        // declaring index and array digits and giving its size equal to maxdigit
		int maxDigit= 10;
		int[] digits= new int[maxDigit];
		int index= 0;

        // storing each digit in array if the number is not equal to zero
		while(number!= 0)
		{
			digits[index]= number%10;
			number= number/10;
			index++;
            
			// if number of digits is more than maxDigit, then breaking the loop
			if(index==maxDigit)
			{
				break;
			}
		}

        // calculating the largest and the second largest digit
		int largest= 0;
		int secondLargest= 0;
		for(int i=0;i<index;i++)
		{
			if(digits[i]>largest)
			{
				secondLargest= largest;
				largest= digits[i];
			}
			else if(digits[i]>secondLargest && digits[i]!=largest)
			{
				secondLargest= digits[i];
			}
		}

        // displaying the largest and second largest digits
		System.out.println("Largest digit: "+ largest);
		System.out.println("\nSecond largest digit: "+ secondLargest);

		input.close();
		}
	}
