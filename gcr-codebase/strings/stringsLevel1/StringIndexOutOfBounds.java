
import java.util.Scanner;
public class StringIndexOutOfBounds{

    // Method to generate StringIndexOutOfBoundsException
    void generateException(String text) 
	{
        // Accessing index beyond string length
        System.out.println(text.charAt(text.length()));
    }

    // Method to handle string index out of bounds exception
    void handleException(String text) 
	{
		try 
		{
            System.out.println(text.charAt(text.length()));
        } 
		catch(StringIndexOutOfBoundsException e) 
		{
            System.out.println("StringIndexOutOfBoundsException caught and handled");
        }
    }

 public static void main(String[] args) {
  Scanner sc= new Scanner(System.in);
  
        StringIndexOutOfBounds excep= new StringIndexOutOfBounds();
		// Taking user input
        System.out.println("Enter a string:");
        String input= sc.next();

        //Calling method to generate exception
          excep.generateException(input);
		// Calling method to handle the RuntimeException
          excep.handleException(input);
		}
	}
