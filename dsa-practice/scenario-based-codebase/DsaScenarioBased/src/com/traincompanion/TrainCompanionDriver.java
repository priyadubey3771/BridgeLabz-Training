package com.traincompanion;

import java.util.Scanner;
public class TrainCompanionDriver {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	TrainManager manager = new TrainManager();

    int choice;
    do 
    {
        System.out.println("\n--- Train Companion Menu ---");
        System.out.println("1. Add Compartment");
        System.out.println("2. Remove Compartment");
        System.out.println("3. Traverse Forward");
        System.out.println("4. Traverse Backward");
        System.out.println("5. Show Adjacent Compartments");
        System.out.println("6. Exit");
        System.out.print("Enter choice: ");

        choice = sc.nextInt();
        sc.nextLine();

        switch (choice) 
        {
            case 1:
                System.out.print("Enter compartment name: ");
                manager.addCompartment(sc.nextLine());
                break;

             case 2:
                System.out.print("Enter compartment name to remove: ");
                manager.removeCompartment(sc.nextLine());
                break;

            case 3:
                manager.traverseForward();
                break;

            case 4:
                manager.traverseBackward();
                break;

            case 5:
                System.out.print("Enter compartment name: ");
                manager.showAdjacent(sc.nextLine());
                break;

            case 6:
                System.out.println("Exiting Train Companion System.");
                break;

            default:
                System.out.println("Invalid choice.");
        }

    } 
    while (choice != 6);
    
  sc.close();
  
}
  }

