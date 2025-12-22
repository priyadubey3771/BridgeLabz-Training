
import java.util.Scanner;
public class NumberChecker4{
    //Method to check Prime Number
    public static boolean isPrime(int number)
    {
        if(number<= 1)
        {
            return false;
        }
        for(int i=2;i<= Math.sqrt(number);i++)
        {
            if(number%i== 0)
            {
                return false;
            }
        }
        return true;
    }
	//Method to check Neon Number
    public static boolean isNeon(int number)
    {
        int square= number*number;
        int sum= 0;
		while(square!= 0)
        {
            sum= sum+ square%10;
            square= square/10;
        }
        return sum==number;
    }
	//Method to check Spy Number
    public static boolean isSpy(int number)
    {
        int sum=0;
        int product=1;
		while(number!=0)
        {
            int digit=number%10;
            sum= sum+digit;
            product= product*digit;
            number= number/10;
        }
        return sum==product;
    }
	//Method to check Automorphic Number
    public static boolean isAutomorphic(int number)
    {
        int square=number*number;
        int temp=number;
		while(temp!= 0)
        {
            if(temp%10!= square%10)
            {
                return false;
            }
            temp/= 10;
            square/= 10;
        }
        return true;
    }
	//Method to check Buzz Number
    public static boolean isBuzz(int number)
    {
        if(number%7==0||number%10==7)
        {
            return true;
        }
        return false;
    }
 public static void main(String[] args)
    {
        //Taking input from user
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number:");
        int number=input.nextInt();

        //Checking Prime Number
        if(isPrime(number))
        {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Not a Prime Number");
        }

        //Checking Neon Number
        if(isNeon(number))
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not a Neon Number");
        }

        //Checking Spy Number
        if(isSpy(number))
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not a Spy Number");
        }

        //Checking Automorphic Number
        if(isAutomorphic(number))
        {
            System.out.println("Automorphic Number");
        }
        else
        {
            System.out.println("Not an Automorphic Number");
        }

        //Checking Buzz Number
        if(isBuzz(number))
        {
            System.out.println("Buzz Number");
        }
        else
        {
            System.out.println("Not a Buzz Number");
        }

        input.close();
    }
}
