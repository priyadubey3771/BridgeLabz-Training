
import java.util.Scanner;
public class WatchSimulation{
  public static void main(String[] args){
  
   Scanner sc = new Scanner(System.in);
   
   // iterating loop for hours
   for(int hour=0; hour<24; hour++)
   {
           //iterating loop for minutes
		   for(int minutes=0; minutes<60; minutes++)
	       {
			       // stopping when hour is 13
		           if (hour == 13 && minutes == 0) 
		           {
                     System.out.println("Power cut! Watch stopped.");
                     break;
		           }
				   
		           System.out.printf( "%02d:%02d", hour, minutes);
				   System.out.println("\n");
           }

          if(hour==13)
		  {
		    break;
		  }
	}
	sc.close();
	}
   }