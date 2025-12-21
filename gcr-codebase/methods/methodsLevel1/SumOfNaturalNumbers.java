
import java.util.Scanner;
public class SumOfNaturalNumbers
{
    // Method to calculate sum of first n natural numbers
    int sum(int n)
    {
        int total = 0;
        for(int i = 1; i <= n; i++)
        {
            total += i;
        }
        return total;
    }

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

        // taking number as input from the user
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        // checking if the user entered a valid number or not and displaying the result
        if(n<=0)
        {
            System.out.println("Please enter a positive integer.");
        }
        else
        {
            SumOfNaturalNumbers sumNumber = new SumOfNaturalNumbers();
			int result = sumNumber.sum(n); 
			System.out.println("The sum of first " + n + " natural numbers is: " + result);
        }

        input.close();
       }
     }
