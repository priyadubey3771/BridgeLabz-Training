
import java.util.Scanner;
public class Frequency {
 public static void main (String[] args){
	Scanner input = new Scanner(System.in);

		//taking number as input from the user and declaring the variable temp and count
        System.out.print("Enter a number: ");
        int number = input.nextInt();
		int temp = number;
        int count = 0;
         
		//counting and storing the number of digits
        while (temp != 0)
        {
            count++;
            temp = temp / 10;
        }
        int[] digits = new int[count];
		temp = number;
        int index = 0;
        while (temp != 0)
        {
            digits[index] = temp % 10;
            temp = temp / 10;
            index++;
        }
         
		 // initializing the array frequency with size 10
        int[] frequency = new int[10];
		for (int i = 0; i < digits.length; i++)
        {
            frequency[digits[i]]++;
        }
		
        // displaying the frequency of the digits
        System.out.println("Digit Frequency:");
		for (int i =0; i < frequency.length; i++)
        {
            if (frequency[i] > 0)
            {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        input.close();
    }
}
