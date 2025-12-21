
import java.util.Scanner;
public class TrigonometricFunctions {

      // method to calculate the Trigonometric Functions
       double[] calculateTrigonometricFunctions(double angle) 
	{
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[] {sine, cosine, tangent};
    }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        // taking the angles in degrees as input from the user
        System.out.print("Enter an angle in degrees: ");
        double angle = input.nextDouble();

        // calculating the Trigonometric Functions and displaying the results 
        TrigonometricFunctions obj = new TrigonometricFunctions();
        double[] result = obj.calculateTrigonometricFunctions(angle);
		System.out.println("Sine: " + result[0]);
        System.out.println("\nCosine: " + result[1]);
        System.out.println("\nTangent: " + result[2]);

        input.close();
    }
}
