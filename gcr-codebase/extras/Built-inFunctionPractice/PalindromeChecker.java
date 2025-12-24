
import java.util.Scanner;
public class PalindromeChecker{

    // Method to take string input from user
    static String takeInput(Scanner sc)
    {
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }
	// Method to check whether the string is palindrome
    static boolean isPalindrome(String text)
    {
        int start= 0;
        int end= text.length()-1;
		while(start< end)
        {
            if(text.charAt(start)!= text.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
	// Method to display result
    static void displayResult(String text,boolean result)
    {
        if(result)
        {
            System.out.println("\"" +text+ "\" is a Palindrome");
        }
        else
        {
            System.out.println("\""+text+ "\" is NOT a Palindrome");
        }
    }

public static void main(String[] args){
   Scanner sc= new Scanner(System.in);

        String text= takeInput(sc);
		boolean result= isPalindrome(text);
		displayResult(text, result);
     }
   }
