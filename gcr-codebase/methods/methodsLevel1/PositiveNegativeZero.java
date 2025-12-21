
import java.util.Scanner;
public class PositiveNegativeZero{

    // find whether the number is positive, negative or zero
    int checkNumber(int number)
    {
        if(number > 0)
        {
            return 1;
        }
        else if(number < 0)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

        // taking the number as input from the user
        System.out.print("Enter a number : ");
        int num= input.nextInt();
		PositiveNegativeZero number= new PositiveNegativeZero();
        int result = number.checkNumber(num);

        // checking if the number is positive, negative or zero and displaying the result
        if(result == 1)
        {
            System.out.println("The number is Positive");
        }
        else if(result== -1)
        {
            System.out.println("The number is Negative");
        }
        else
        {
            System.out.println("The number is Zero");
        }

        input.close();
    }
}
