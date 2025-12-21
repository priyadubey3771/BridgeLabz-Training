
import java.util.Scanner;
public class ChocolateDistribution {

    // method to find the number of chocolate each children will get and the remaining chocolates
    int[] distributingChocolate(int number, int divisor) 
	{
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[] {quotient, remainder};
    }

 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

        // taking the total number of chocolates and number of children as input from the user
        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = input.nextInt();
        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        // calculating the number of chocolate each children will get and the remaining chocolates and displaying the result
        if (numberOfChildren == 0) 
		{
            System.out.println("Number of children cannot be zero.");
        } 
		else 
		{
            ChocolateDistribution chocolates = new ChocolateDistribution();
            int[] result = chocolates.distributingChocolate(numberOfChocolates, numberOfChildren);
			System.out.println("Each child will get: " + result[0] + " chocolates");
            System.out.println("Remaining chocolates: " + result[1]);
        }

        input.close();
    }
   }
