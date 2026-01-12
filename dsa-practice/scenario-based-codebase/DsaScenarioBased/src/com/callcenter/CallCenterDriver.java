package com.callcenter;

import java.util.Scanner;
public class CallCenterDriver {
  public static void main(String[] args) {
	  
	  Scanner sc = new Scanner(System.in);
	  CallCenterManager manager = new CallCenterManager();
	  
	  int choice;
	  
	  do
	  {
		  System.out.println("\n--- Call Center Menu---");
		  System.out.println("1. Receive Call");
		  System.out.println("2. Handle Next Call");
		  System.out.println("3. Display Call Count");
		  System.out.println("4. Exit");
		  System.out.println("Enter choice: ");
		  
		  choice = sc.nextInt();
		  sc.nextLine();
		  
		  switch(choice)
		  {
		  case 1:
			  System.out.println("Enter Customer ID:");
			  String id = sc.nextLine();
			  System.out.println("Enter Customer Name:");
			  String name = sc.nextLine();
			  System.out.println("Is VIP? (true/false): ");
			  boolean isVIP = sc.nextBoolean();
			  
			  manager.receiveCall(new Customer(id, name, isVIP));
			  break;
			  
		  case 2:
			  manager.handleNextCall();
			  break;
			  
		  case 3:
			  manager.displayCallCounts();
			  break;
		  case 4:
			  System.out.println("Exiting Call Center System.");
			  break;
			  
		   default:
			   System.out.println("Invalid choice");
		  }
	  } 
	  while(choice != 4);
	  sc.close();
  }
}
