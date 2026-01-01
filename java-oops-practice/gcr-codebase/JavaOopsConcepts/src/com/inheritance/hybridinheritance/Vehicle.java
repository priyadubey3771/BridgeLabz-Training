package com.inheritance.hybridinheritance;

//Superclass representing vehicle
public class Vehicle {

 // Common attributes for all vehicles
 protected int maxSpeed;
 protected String model;

 // Constructor
 public Vehicle(int maxSpeed, String model) 
 {
     this.maxSpeed = maxSpeed;
     this.model = model;
 }

 // Method to display vehicle information
  public void displayInfo() 
  {
    System.out.println("Model: " + model);
    System.out.println("Max Speed: " + maxSpeed + " km/h");
  }
}
