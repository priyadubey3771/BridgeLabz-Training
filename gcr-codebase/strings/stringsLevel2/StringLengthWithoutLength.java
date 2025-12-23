
import java.util.Scanner;
public class StringLengthWithoutLength {

    // User defined method to find string length
    int findLength(String text) {

        int count=0;
		try 
		{
             while(true) 
			{          
                text.charAt(count); 
                count++;
            }
        } 
		catch(StringIndexOutOfBoundsException e) 
		{
            // exception occurs when index exceeds string length
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        StringLengthWithoutLength leng= new StringLengthWithoutLength();

        // Taking user input
        System.out.println("Enter a string:");
        String input= sc.next();

        // Calling user defined method
        int userLength= leng.findLength(input);
		// Calling built in method
        int builtInLength= input.length();
		
		// Displaying results
        System.out.println("Length using user-defined method: "+userLength);
        System.out.println("Length using built-in length() method: "+builtInLength);
      }
    }
