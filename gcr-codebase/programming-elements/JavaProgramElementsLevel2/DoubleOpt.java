
import java.util.*;
public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		// Creating variables and getting user input
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();
         System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

         System.out.print("Enter value of c: ");
        double c = sc.nextDouble();
		double result1, result2, result3, result4;
		
		//computing three integer operation and assigning the value to the variables
          result1 = a + b * c;     
          result2 = a * b + c;     
          result3 = c + a / b;     
          result4 = a % b + c;     

        // Displaying the result
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}

 
