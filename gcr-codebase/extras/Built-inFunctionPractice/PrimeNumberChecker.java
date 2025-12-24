
import java.util.Scanner;
public class PrimeNumberChecker{

    // Method to check whether a number is prime
    static boolean isPrime(int number)
    {
        if(number<= 1)
        {
            return false;
        }
		for(int i=2; i<=number/2; i++)
        {
            if(number%i==0)
            {
                return false;
            }
        }
        return true;
    }

public static void main(String[] args){
   Scanner sc= new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number= sc.nextInt();
		boolean result= isPrime(number);
		if(result)
        {
            System.out.println(number + " is a Prime Number");
        }
        else
        {
            System.out.println(number + " is NOT a Prime Number");
        }
     }
 }
