package com.inheritance.assistedproblems;

//Superclass representing vehicle
public class Vehicle {

 protected int maxSpeed;  
 protected String fuelType;

 // Constructor
 public Vehicle(int maxSpeed, String fuelType) 
 {
     this.maxSpeed = maxSpeed;
     this.fuelType = fuelType;
 }

 // Method to display common vehicle information
 public void displayInfo() 
 {
     System.out.println("Max Speed: " + maxSpeed + " km/h");
     System.out.println("Fuel Type: " + fuelType);
 }
}
