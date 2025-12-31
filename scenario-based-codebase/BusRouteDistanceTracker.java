
import java.util.Scanner;
public class BusRouteDistanceTracker {
   public static void main(String[] args){
   
   Scanner sc = new Scanner(System.in);
   
   // storing the distance of all stops in array
   double[] distanceStop =  { 5.5, 9, 10, 13, 15};
   int numberOfStops = 5;
   int stopsCovered =0;
   double totalDistance =0;
   
   // iterating loop until the user exits or the last destination is reached
   while(stopsCovered< numberOfStops)
   {
       int i = stopsCovered;
   
        // if the last stop is reached, then displaying the total distance
       if(stopsCovered==4)
		{
		    totalDistance = totalDistance + distanceStop[i];
		    System.out.println("Total distance covered is: "+ totalDistance);
			break;
		}
   
        // for all stops before the last stop, performing the below operations
		totalDistance = totalDistance + distanceStop[i];
		stopsCovered++;
        
		// asking if the passenger wants to get off
        System.out.println("Do you want to get off at stop " + (i+1)+" (Y/N)?");		
        char choice = sc.next().charAt(0);
		
		// if no, then continue travelling
		if(choice=='n'|| choice =='N')
		{
		   continue;
		}
		// if passenger stops to travel, display the total distance and break
		else
		{
		    System.out.println("Total distance covered is: "+ totalDistance);
		     break;
		}
	}
	sc.close();
	}
  }
		