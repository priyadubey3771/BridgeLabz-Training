
import java.util.Scanner;
public class PalindromeNumber {

    // Checking whether a given number is a palindrome
    public static boolean isPalindrome(int x) 
	{

        // Negative numbers cannot be palindromes
        if(x<0) 
		{
            return false;
        }

        int original = x;
        int reversed = 0;

        // Reversing the number digit by digit
        while (x != 0) 
		{
            reversed = reversed * 10 + (x % 10);
            x = x / 10;
        }

        // Comparing original number with reversed number
        return original == reversed;
    }

  public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to check for palindrome");
        int x = sc.nextInt();

        if (isPalindrome(x)) 
		{
            System.out.println("Yes, the number is a palindrome.");
        } 
		else 
		{
            System.out.println("No, the number is not a palindrome.");
        }
		
		sc.close();
    }
  }
