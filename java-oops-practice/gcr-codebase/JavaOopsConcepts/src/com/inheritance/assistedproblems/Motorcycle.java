package com.inheritance.assistedproblems;

public class Motorcycle extends Vehicle {

 private boolean hasKickStart;

 public Motorcycle(int maxSpeed, String fuelType, boolean hasKickStart) 
 {
     super(maxSpeed, fuelType);
     this.hasKickStart = hasKickStart;
 }

 @Override
 public void displayInfo() 
 {
     super.displayInfo();
     System.out.println("Kick Start Available: " + hasKickStart);
 }
}

