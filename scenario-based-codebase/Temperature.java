
import java.util.Scanner;
public class Temperature{
  public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);
	double[] temperature = new double[7];
	double totalTemperature = 0;
	System.out.println("Enter temperature for Day1:");
	temperature[0] = sc.nextDouble();
	
	double maxTemperature = temperature[0];
	int j = 1;
	totalTemperature = temperature[0];
	
	for(int i=1; i<temperature.length;i++)
	{
	      System.out.println("Enter the temperature for Day" + (i+1));
		  temperature[i] = sc.nextDouble();
		  if(temperature[i] > maxTemperature)
		  {
		          maxTemperature = temperature[i];
				  j = i+1; 
		  }
		  totalTemperature = totalTemperature + temperature[i];
	} 

     System.out.println("Maximum temperature is" + maxTemperature+ "on day"+j);
	 System.out.println("Average temperature is" + (totalTemperature/7));
	 
	  sc.close();
	  }
	}