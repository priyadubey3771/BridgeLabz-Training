
import java.util.Scanner;
public class Handshakes{

  // find the number of hand shakes
 int calculateHandshakes(int n)
    {
        return (n*(n-1))/2;
    }
	
  public static void main (String[] args){
	Scanner input= new Scanner(System.in);
	
	   // taking number of students as input
	    System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();
		
		// calculating the maximum hand shakes by passing arguments
        Handshakes maximumHandshakes  = new Handshakes();
        int handshake = maximumHandshakes.calculateHandshakes(numberOfStudents);
	
	    // displaying the output
        System.out.println("Maximum number of handshakes: " + handshake);
        input.close();
    }
}







