
import java.util.Scanner;
public class WindChillCalculator {

    //method to find the windchill
    public double calculateWindChill(double temperature, double windSpeed) 
	{
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        // taking the temperature and windspeed as input from the user
        System.out.print("Enter the temperature(in Fahrenheit): ");
        double temperature = input.nextDouble();
        System.out.print("Enter the wind speed(in mph): ");
        double windSpeed = input.nextDouble();

         // calculating the windchill temperature and displaying the result
        WindChillCalculator obj = new WindChillCalculator();
        double windChill = obj.calculateWindChill(temperature, windSpeed);
		System.out.println("The wind chill temperature is: " + windChill);
		input.close();
     }
   }
