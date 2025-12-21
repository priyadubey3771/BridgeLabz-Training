
import java.util.Scanner;
public class SmallestAndLargest {

     // method to find the smallest and largest number
     int[] findSmallestAndLargest(int number1, int number2, int number3) 
	{
        int smallest = number1;
        int largest = number1;

        if (number2 < smallest) 
		{
            smallest = number2;
        }
        if (number3 < smallest) 
		{
            smallest = number3;
        }
		if (number2 > largest) 
		{
            largest = number2;
        }
        if (number3 > largest) 
		{
            largest = number3;
        }

        return new int[] {smallest, largest};
    }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

       // taking first,second, third number as the input from the user
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        // calculating the smallest and largest number by passing arguements
        SmallestAndLargest smallLarge = new SmallestAndLargest();
        int[] result = smallLarge.findSmallestAndLargest(num1, num2, num3);
        
		// displaying the result
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);

        input.close();
     }
   }
