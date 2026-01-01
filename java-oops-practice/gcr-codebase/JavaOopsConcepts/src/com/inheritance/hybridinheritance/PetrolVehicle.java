package com.inheritance.hybridinheritance;

public class PetrolVehicle extends Vehicle implements Refuelable {

 // Constructor calling the superclass constructor
 public PetrolVehicle(int maxSpeed, String model) 
 {
     super(maxSpeed, model);
 }

 // Implementation of refuel behavior
 @Override
 public void refuel() 
 {
     System.out.println("Petrol vehicle is refueling.");
 }

 // Overridden method to display details
 @Override
 public void displayInfo() 
 {
     super.displayInfo();
     System.out.println("Vehicle Type: Petrol");
     refuel();
 }
}
