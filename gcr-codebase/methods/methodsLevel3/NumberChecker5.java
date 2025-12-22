
import java.util.Scanner;
public class NumberChecker5{
    
	//Method to find sum of proper divisors of a number
    public static int sumOfProperDivisors(int number)
    {
        int sum=0;
        for(int i=1;i<=number/2;i++)
        {
            if(number%i== 0)
            {
                sum= sum+i;
            }
        }
        return sum;
    }
	//Method to check Perfect Number
    public static boolean isPerfect(int number)
    {
        return sumOfProperDivisors(number)== number;
    }
	//Method to check Abundant Number
    public static boolean isAbundant(int number)
    {
        return sumOfProperDivisors(number)> number;
    }
	//Method to check Deficient Number
    public static boolean isDeficient(int number)
    {
        return sumOfProperDivisors(number)< number;
    }
	//Method to calculate factorial of a digit
    public static int factorial(int digit)
    {
        int fact=1;
        for(int i=1; i<=digit;i++)
        {
            fact= fact*i;
        }
        return fact;
    }
	//Method to check Strong Number
    public static boolean isStrong(int number)
    {
        int temp=number;
        int sum=0;
		while(temp!=0)
        {
            int digit=temp%10;
            sum= sum+ factorial(digit);
            temp= temp/10;
        }
        return sum==number;
    }

  public static void main(String[] args){
        //Taking input from user
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number:");
        int number=input.nextInt();

        //Checking Perfect Number
        if(isPerfect(number))
        {
            System.out.println("Perfect Number");
        }
        else
        {
            System.out.println("Not a Perfect Number");
        }

        //Checking Abundant Number
        if(isAbundant(number))
        {
            System.out.println("Abundant Number");
        }
        else
        {
            System.out.println("Not an Abundant Number");
        }

        //Checking Deficient Number
        if(isDeficient(number))
        {
            System.out.println("Deficient Number");
        }
        else
        {
            System.out.println("Not a Deficient Number");
        }

        //Checking Strong Number
        if(isStrong(number))
        {
            System.out.println("Strong Number");
        }
        else
        {
            System.out.println("Not a Strong Number");
        }

        input.close();
    }
}
