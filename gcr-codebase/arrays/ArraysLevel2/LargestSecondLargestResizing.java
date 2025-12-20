
import java.util.Scanner;
public class LargestSecondLargestResizing {
 public static void main (String[] args){
	Scanner input = new Scanner(System.in);

         //taking number as the input from the user
		System.out.print("Enter a number:");
		int number= input.nextInt();

         // declaring index array digits and giving its size equal to maxdigit
		int maxDigit= 10;
		int[] digits= new int[maxDigit];
		int index= 0;

         // storing each digit in array if the number is not equal to zero and resizing if index equals maxDigit
		while(number!= 0)
		{
			if(index==maxDigit)
			{
				maxDigit= maxDigit+10;
				int[] temp= new int[maxDigit];

				for(int i=0;i<digits.length;i++)
				{
					temp[i]= digits[i];
				}

			digits= temp;
			}

		digits[index]= number%10;
		number= number/10;
		index++;
		}

        // calculating the largest and the second largest digit
		int largest= 0;
		int secondLargest= 0;
        for(int i=0; i<index; i++)
		{
			if(digits[i]> largest)
			{
				secondLargest= largest;
				largest= digits[i];
			}
			else if(digits[i]>secondLargest && digits[i]!=largest)
			{
				secondLargest= digits[i];
			}
		}

        // displaying the largest and second digits
		System.out.println("Largest digit: "+ largest);
		System.out.println("Second largest digit: "+ secondLargest);

		input.close();
		}
	}
