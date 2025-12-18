import java.util.*;
 //creating a class to take user input in kilometers and change it to miles
public class KilometersToMilesWithInput
 {
   public static void main (String args[])
   {
      Scanner input = new Scanner(System.in) ;
	  
	  //create variables to store distance in kilometers and miles
      double Km ;
      double Miles ;
      Km = input.nextDouble() ;
      Miles = Km * 1.6 ;
	  
	  //Displaying distance in kilometers and miles 
	  System.out.println(" The total miles is " +Miles +" mile for the given " +Km+ " km") ;
   
   }
}