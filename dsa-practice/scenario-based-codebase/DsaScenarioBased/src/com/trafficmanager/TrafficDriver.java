package com.trafficmanager;

import java.util.Scanner;
public class TrafficDriver {
  public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	TrafficManager manager = new TrafficManager();
	int choice;

    do 
    {
	    System.out.println("\n--- Traffic Manager Menu ---");
	    System.out.println("1. Add Vehicle to Queue");
	    System.out.println("2. Enter Roundabout");
	    System.out.println("3. Exit Roundabout");
	    System.out.println("4. Display Roundabout");
	    System.out.println("5. Exit");
	    System.out.print("Enter choice: ");
	
	    choice = sc.nextInt();
	    sc.nextLine();
	
	    switch (choice) 
	    {
	        case 1:
	            System.out.print("Enter vehicle number: ");
	            manager.addToQueue(sc.nextLine());
	            break;
	
	        case 2:
	            manager.enterRoundabout();
	            break;
	
	        case 3:
	            System.out.print("Enter vehicle number to exit: ");
	            manager.exitRoundabout(sc.nextLine());
	            break;
	
	        case 4:
	            manager.displayRoundabout();
	            break;
	
	        case 5:
	            System.out.println("Exiting Traffic Manager.");
	            break;
	
	        default:
	            System.out.println("Invalid choice.");
	    }

      } 
      while (choice != 5);

    sc.close();
    
    }
}
