
import java.util.*;
public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		// Creating variables and getting user input
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter value of c: ");
        int c = sc.nextInt();
		
		//computing three integer operation and assigning the value to the variables
        int result1 = a + b * c;    
        int result2 = a * b + c;     
        int result3 = c + a / b;     
        int result4 = a % b + c;    
		
		 // Displaying the result
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}
