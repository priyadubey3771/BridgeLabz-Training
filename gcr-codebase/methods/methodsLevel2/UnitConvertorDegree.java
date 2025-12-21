
import java.util.Scanner;
public class UnitConvertorDegree {

    // method to convert Farhenheit To Celsius
    public static double convertFarhenheitToCelsius(double farhenheit) 
	{
        double farhenheit2celsius= (farhenheit- 32) * 5/9;
        return farhenheit2celsius;
    }

     // method to convert Celsius To Farhenheit
    public static double convertCelsiusToFarhenheit(double celsius) 
	{
        double celsius2farhenheit = (celsius* 9/5) +32;
        return celsius2farhenheit;
    }

     // method to convert Pounds To Kilograms
    public static double convertPoundsToKilograms(double pounds) 
	{
        double pounds2kilograms= 0.453592;
        return pounds* pounds2kilograms;
    }
     // method to convert Kilograms To Pounds
    public static double convertKilogramsToPounds(double kilograms) 
	{
        double kilograms2pounds= 2.20462;
        return kilograms* kilograms2pounds;
    }

      // method to convert Gallons To Liters
    public static double convertGallonsToLiters(double gallons) 
	{
        double gallons2liters= 3.78541;
        return gallons *gallons2liters;
    }

       // method to convert Liters To Gallons
    public static double convertLitersToGallons(double liters) 
	{
        double liters2gallons= 0.264172;
        return liters *liters2gallons;
    }

 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.print("Enter Fahrenheit:");
        double f = input.nextDouble();
        System.out.println("Fahrenheit to Celsius:"+convertFarhenheitToCelsius(f));
        System.out.print("Enter Celsius:");
        double c = input.nextDouble();
        System.out.println("Celsius to Fahrenheit: "+convertCelsiusToFarhenheit(c));
		System.out.print("Enter pounds:");
        double pounds = input.nextDouble();
        System.out.println("Pounds to Kilograms: "+convertPoundsToKilograms(pounds));
		System.out.print("Enter kilograms:");
        double kg = input.nextDouble();
        System.out.println("Kilograms to Pounds: "+ convertKilogramsToPounds(kg));
		System.out.print("Enter gallons: ");
        double gallons = input.nextDouble();
        System.out.println("Gallons to Liters:"+convertGallonsToLiters(gallons));
		System.out.print("Enter liters: ");
        double liters = input.nextDouble();
        System.out.println("Liters to Gallons: "+convertLitersToGallons(liters));

        input.close();
    }
}
