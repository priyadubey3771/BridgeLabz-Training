
import java.util.*;
public class QuotientRemainders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		// taking numbers as input from the user
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
		
		//computing the quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;
		
		//displaying the result
        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + number1 + " and " + number2);
    }
}
