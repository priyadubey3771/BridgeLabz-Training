
import java.util.Scanner;
public class Temperature{
  public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);
	double[] temperature = new double[7];
	double totalTemperature = 0;
	
	// taking Day 1 temperature as input from the user
	System.out.println("Enter temperature for Day1:");
	temperature[0] = sc.nextDouble();
	
	// initializing the maxTemperature with the day 1 temperature because all temperatures can be negative
	double maxTemperature = temperature[0];
	// initializing j to find the day with maximum temperature
	int j = 1;
	totalTemperature = temperature[0];
	
	for(int i=1; i<temperature.length;i++)
	{
		 // taking temperature as input from day 2 to day 7
	      System.out.println("Enter the temperature for Day" + (i+1));
		  temperature[i] = sc.nextDouble();
		  
		  // finding the max temperature and day of max temperature
		  if(temperature[i] > maxTemperature)
		  {
		          maxTemperature = temperature[i];
				  j = i+1; 
		  }
		  // calculating the total temperature
		  totalTemperature = totalTemperature + temperature[i];
	} 

      // displaying the results
     System.out.println("Maximum temperature is" + maxTemperature+ "on day"+j);
	 System.out.println("Average temperature is" + (totalTemperature/7));
	 
	  sc.close();
	  }
	}