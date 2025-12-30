
import java.util.Scanner;
public class Reservation{
   public static void main(String[] args){
   
   Scanner sc = new Scanner(System.in);
   // taking total number of available seats as 10
   int availableSeats = 10;
   int choice=0;
   
   while(choice!=3 && availableSeats!=0)
   {   
        // displaying the menu
        System.out.println("Train reservation menu");
		System.out.println("1.Book the train ticket");
		System.out.println("2.Check the seat availability");
		System.out.println("3.Exit the system");
   
        // taking choice as input from the user
		System.out.println("Enter your choice:");
		choice = sc.nextInt();
	  
	     // checking the various cases and displaying results accordingly
	  switch(choice)
	        {
			   case 1:  
			         {   
					     // checking seat availability and booking the ticket
					     if(availableSeats>0)
						 {
							System.out.println("Ticket booked successfully");
							 availableSeats--;
						 }
						 else 
						 {
						    System.out.println("Seats booked. No ticket available");
						 }
						 
						 break;
						 
					  }
                case 2:
                      {     
					       // checking the number of available seats
                           System.out.println("Total number of available seats is:"+ availableSeats);
                           break;
                      }								 
				case 3:
				      {
						   //exiting the system
						   System.out.println("Exited the system successfully");
					       break;
					  } 
                 default:
                       {
						    // displaying that the user entered the wrong choice
                            System.out.println("You entered the wrong choice");
							break;
                       }	
            }
        }			
          
            System.out.println("Thank You for visting the Indian railways");
			
			sc.close();
		
		}
	}