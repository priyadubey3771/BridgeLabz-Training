
import java.util.Scanner;
public class Parking{
 public static void main(String args[]){
 
       Scanner sc = new Scanner(System.in);
	   // declaring and initializing totalSlots and occupiedSlots
	   int totalSlots = 20;
	   int occupiedSlots = 0;
	   int choice=0;
	   
	   //displaying menu until the user exits and there is free space 
	   while( choice!=4 && occupiedSlots < totalSlots)
	   {
	       if(occupiedSlots==totalSlots)
		   {
		      System.out.println("Parking lot is Full!");
			  break;
		   }
		   // displaying parking menu
	      System.out.println("Parking lot menu:");
		  System.out.println("\n1.Park Vehicle");
		  System.out.println("\n2.Exit Vehicle");
		  System.out.println("\n3.Show Occupancy");
		  System.out.println("\n4.Exit System");
		  System.out.println("\nEnter your choice:");
		  choice = sc.nextInt();
		  
		  switch(choice)
		  {
			 // parking vehicle if slot available else not
		     case 1:
			      {
			         if(occupiedSlots<totalSlots)
					 {
					    occupiedSlots++;
						System.out.println("\nVehicle is parked successfully");
					 }
					 else
					 {
					    System.out.println("\nNo parking slots available");
					 }
					 break;
				  }
				  
				  //exiting vehicle if there is any vehicle
		      case 2:
			       { 
				      if(occupiedSlots>0)
					  {
					     occupiedSlots--;
					     System.out.println("\nExited successfully");
					  }
					  else
					  {
					      System.out.println("\nParking lot already empty.");
					  }
					  break;
				   }
				   // displaying the available and occupied slots
				case 3:
				     {
					     System.out.println("\noccupied slots"+ occupiedSlots);
					     System.out.println("\nAvailable slot:" + (totalSlots-occupiedSlots));
						 break;
					 }
					 //exiting successfully
				 case 4:
				     {
					       System.out.println("\nExited system successfully.");
						   break;
					 }
			     default:
				       {
					       System.out.println("Invalid choice please try again");
					   }
			    }
		}
		
			sc.close();
		}
}
				            
					  
					       