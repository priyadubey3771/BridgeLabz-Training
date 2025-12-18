
import java.util.*;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         //Taking two numbers from the user 
        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();
		
		//Performing Arithmetic Operations of addition, subtraction, multiplication, and division
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;
		
		// printing the result of the arithmetic operations
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "+ number1 + " and " + number2 + " is "
		+ addition + ", " + subtraction + ", " + multiplication + ", and " + division);

    }
}

