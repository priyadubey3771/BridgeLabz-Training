
import java.util.Scanner;
public class IllegalArgumentExceptionExample {

    // Method to generate Illegal Argument exception
    void generateException(String text) 
	{
        // start index is greater than end index
        System.out.println(text.substring(5, 2));
    }

    // Method to handle IllegalArgumentException
    void handleException(String text) 
	{
        try 
		{
            System.out.println(text.substring(5, 2));
        } 
		catch(IllegalArgumentException e) 
		{
            System.out.println("IllegalArgumentException caught and handled");
        } 
		catch(RuntimeException e) 
		{
            System.out.println("Generic RuntimeException caught");
        }
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        IllegalArgumentExceptionExample excep= new IllegalArgumentExceptionExample();

        // Taking user input
        System.out.println("Enter a string:");
        String input= sc.next();
		//Call method to generate exception
        excep.generateException(input);
		//Call method to handle the RuntimeException
        excep.handleException(input);
    }
}
