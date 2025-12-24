
import java.util.Scanner;
public class TemperatureConverter{

    // Method to convert Fahrenheit to Celsius
    static double fahrenheitToCelsius(double fahrenheit)
    {
        double celsius= (fahrenheit-32) * 5/9;
        return celsius;
    }
	// Method to convert Celsius to Fahrenheit
    static double celsiusToFahrenheit(double celsius)
    {
        double fahrenheit= (celsius * 9/5) + 32;
        return fahrenheit;
    }

public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
		if(choice==1)
        {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = sc.nextDouble();
			double celsius = fahrenheitToCelsius(fahrenheit);
			System.out.println("Temperature in Celsius: "+celsius);
        }
        else if(choice==2)
        {
            System.out.print("Enter temperature in Celsius: ");
            double celsius= sc.nextDouble();
			double fahrenheit = celsiusToFahrenheit(celsius);
			System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        }
        else
        {
            System.out.println("Invalid choice");
        }
     }
   }
