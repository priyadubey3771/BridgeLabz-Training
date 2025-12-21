
import java.util.Scanner;
public class QuotientAndRemainder {

     // method to find the quotient and remainder
    int[] findRemainderAndQuotient(int number, int divisor) 
	{
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[] {quotient, remainder};
    }
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

       // taking the number and divisor as input from the user
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();

        // checking if the divisor is valid or not and calculating the quotient and remainder and displaying the result
        if (divisor == 0) 
		{
            System.out.println("Division by zero is not allowed.");
        } 
		else 
		{
            QuotientAndRemainder remainderQuotient = new QuotientAndRemainder();
            int[] result = remainderQuotient.findRemainderAndQuotient(number, divisor);
			System.out.println("Quotient: " + result[0]);
            System.out.println("\nRemainder: " + result[1]);
        }

        input.close();
     }
    }
