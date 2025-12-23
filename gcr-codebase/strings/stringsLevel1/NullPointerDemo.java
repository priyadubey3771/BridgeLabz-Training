
public class NullPointerDemo {

    // Method to generate NullPointerException
    void generateException() 
	{
        String text= null;
        System.out.println(text.length());
    }
	// Method to handle NullPointerException
    void handleException() 
	{
        String text= null;     
		try 
		{
            System.out.println(text.length());
        } 
		catch(NullPointerException e) 
		{
            System.out.println("NullPointerException caught and handled");
        }
    }

 public static void main(String[] args){

        NullPointerDemo excep= new NullPointerDemo();
		//Calling method to generate exception
         excep.generateException();
		//Refactoring to handle the RuntimeException
         excep.handleException();
     }
   }
