
import java.util.Scanner;
public class ReverseNumberUsingArray {
 public static void main (String[] args){
	Scanner input = new Scanner(System.in);

        //taking number as the input from the user and initializing variable count and temp
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int temp = number;
        int count = 0;

        //counting the number of digits in the number
        while (temp != 0)
        {
			count++;
            temp = temp / 10;
        }

        // initializing the array digits with size equal to count
        int[] digits = new int[count];
        temp = number;
        
		//storing each digit in the array digit
        for (int i = count-1; i >=0; i--)
		{
			digits[i] = temp%10;
			temp = temp/10;
		}
		// declaring array reverse with size equal to count
        int[] reverse = new int[count];

        //storing the digits in the reverse order in the reverse array
        for (int i = 0; i < count; i++)
        {
            reverse[i] = digits[count - 1 - i];
        }

        // Displaying reversed number
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++)
        {
            System.out.print(reverse[i]);
        }

        input.close();
    }
}
