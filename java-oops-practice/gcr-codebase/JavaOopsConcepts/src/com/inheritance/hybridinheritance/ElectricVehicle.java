package com.inheritance.hybridinheritance;

public class ElectricVehicle extends Vehicle {

 // Constructor calling the superclass constructor
 public ElectricVehicle(int maxSpeed, String model) 
 {
     super(maxSpeed, model);
 }

 public void charge() 
 {
     System.out.println("Electric vehicle is charging.");
 }

 // Overridden method to display details
 @Override
 public void displayInfo() 
 {
     super.displayInfo();
     System.out.println("Vehicle Type: Electric");
     charge();
 }
}
