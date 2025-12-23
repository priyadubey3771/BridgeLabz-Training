
import java.util.Scanner;
public class ArrayIndexOutOfBounds{

    // Method to generate ArrayIndexOutOfBoundsException
     void generateException(String[] names) 
	 {
        // Accessing index larger than array length
         System.out.println(names[names.length]);
     }

    // Method to handle ArrayIndexOutOfBoundsException
     void handleException(String[] names) 
	 {
        try 
		{
            System.out.println(names[names.length]);
        } 
		catch(ArrayIndexOutOfBoundsException e) 
		{
            System.out.println("ArrayIndexOutOfBoundsException caught and handled");
        } 
		catch(RuntimeException e) 
		{
            System.out.println("Generic runtime exception caught");
        }
     }

 public static void main(String[] args) {
   Scanner sc= new Scanner(System.in);
   
        ArrayIndexOutOfBounds excep= new ArrayIndexOutOfBounds();
		// Taking user input for array size
        System.out.println("Enter number of names:");
        int size= sc.nextInt();
		String[] names= new String[size];

        // Taking names input
        for (int i=0;i<size;i++) 
		{
            System.out.println("Enter name " + (i+1)+ ":");
            names[i]= sc.next();
        }
        //Calling method to generate exception (program stops here)
         excep.generateException(names);

        //Calling method to handle the RuntimeException
         excep.handleException(names);
    }
}
