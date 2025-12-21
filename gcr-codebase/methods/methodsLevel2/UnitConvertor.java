
import java.util.Scanner;
public class UnitConvertor {

    // method to convert Kilometers to miles
      public static double convertKmToMiles(double km) 
	{
        double km2miles= 0.621371;
        return km*km2miles;
    }

      // method to convert Miles to Kilometers 
      public static double convertMilesToKm(double miles) 
	{
        double miles2km= 1.60934;
        return miles*miles2km;
    }

     // method to convert Meters to Feet
      public static double convertMetersToFeet(double meters) 
	{
        double meters2feet= 3.28084;
        return meters* meters2feet;
    }

     // method to convert Feet to meters
      public static double convertFeetToMeters(double feet) 
	{
        double feet2meters=0.3048;
        return feet*feet2meters;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // taking kilometers, miles, meters and feet as input from the user and converting them 
        System.out.print("Enter kilometers: ");
        double km= input.nextDouble();
        System.out.println("Kilometers to Miles: " + convertKmToMiles(km));
        System.out.print("Enter miles: ");
        double miles= input.nextDouble();
        System.out.println("Miles to Kilometers: " + convertMilesToKm(miles));
		System.out.print("Enter meters: ");
        double meters = input.nextDouble();
        System.out.println("Meters to Feet: " + convertMetersToFeet(meters));
		System.out.print("Enter feet: ");
        double feet= input.nextDouble();
        System.out.println("Feet to Meters: " + convertFeetToMeters(feet));

        input.close();
     }
   }
