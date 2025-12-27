package com.constructor.level1;

public class Vehicle {

 private String ownerName;
 private String vehicleType;
 private static double registrationFee = 5000.0;

 // Parameterized constructor to initialize vehicle details
 public Vehicle(String ownerName, String vehicleType) 
 {
     this.ownerName = ownerName;
     this.vehicleType = vehicleType;
 }

 //method to display owner name, vehicle type, and registration fee
 public void displayVehicleDetails() 
 {
     System.out.println("Owner Name: " + ownerName);
     System.out.println("Vehicle Type: " + vehicleType);
     System.out.println("Registration Fee: " + registrationFee);
 }

 // method to update the registration fee for all vehicles
 public static void updateRegistrationFee(double newFee) 
 {
     registrationFee = newFee;
 }
}
