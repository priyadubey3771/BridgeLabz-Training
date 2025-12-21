
import java.util.Scanner;
public class NumberCheck {

    //  Method to Check whether the number is positive or negative
    public boolean isPositive(int number) 
	{
        return number>= 0;
    }

     //Method to check whether the number is even or odd
    public boolean isEven(int number) 
	{
        return number%2== 0;
    }

     // Method to compare two numbers 
    public int compare(int number1, int number2) 
	{
        if (number1> number2) 
		{
            return 1;
        } 
		else if (number1 == number2) 
		{
            return 0;
        } 
		else 
		{
            return -1;
        }
    }

 public static void main(String[] args) {
   Scanner input = new Scanner(System.in);

        int[] numbers= new int[5];
        NumberCheck check= new NumberCheck();

        // checking if the number is positive or negative
        for (int i=0; i<numbers.length; i++) 
		{
            System.out.print("Enter number " + (i+1) + " ");
            numbers[i] = input.nextInt();

            if (check.isPositive(numbers[i])) 
			{
                if (check.isEven(numbers[i])) 
				{
                    System.out.println("Positive and Even");
                }
				else
				{
                    System.out.println("Positive and Odd");
                }
            } 
			else 
			{
                System.out.println("Negative");
            }
        }

         // displaying the result of comparison
        int result= check.compare(numbers[0], numbers[numbers.length - 1]);
		if (result== 1) 
		{
            System.out.println("First element is greater than last element");
        }
		else if (result== 0) 
		{
            System.out.println("First and last elements are equal");
        } 
		else 
		{
            System.out.println("First element is less than last element");
        }

        input.close();
    }
}
