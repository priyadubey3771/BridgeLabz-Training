
import java.util.Scanner;
public class NumberFormatExceptionExample{

    // Method to generate NumberFormatException
    void generateException(String text) 
	{
       // Trying to convert non-numeric text into integer
        int number=Integer.parseInt(text);
        System.out.println("Number: " + number);
    }
	// Method to handle NumberFormatException
    void handleException(String text) 
	{
	   try 
	   {
            int number=Integer.parseInt(text);
            System.out.println("Number:" +number);
       } 
	   catch(NumberFormatException e) 
	   {
            System.out.println("NumberFormatException caught and handled");
       } 
	   catch(RuntimeException e) 
	   {
            System.out.println("Generic RuntimeException caught");
       }
    }

public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        NumberFormatExceptionExample excep=new NumberFormatExceptionExample();

        // Taking user input as String
        System.out.println("Enter a value:");
        String input= sc.next();

        //Calling method to generate exception
         excep.generateException(input);
		//Calling method to handle the RuntimeException
         excep.handleException(input);
     }
  }
