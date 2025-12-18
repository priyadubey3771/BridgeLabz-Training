
import java.util.Scanner;
public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		// Taking the distance provided by the user in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();
		
		//Calculating the distance in yards and miles
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;
		
		// Displaying the distance in yards and miles
        System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);
    }
}
