package com.encapsulation;

//Abstract class representing a vehicle
public abstract class Vehicle {

 // Encapsulated fields
 private String vehicleNumber;
 private String type;
 private double rentalRatePerDay;

 // Constructor
 public Vehicle(String vehicleNumber, String type, double rentalRatePerDay) 
 {
     this.vehicleNumber = vehicleNumber;
     this.type = type;
     setRentalRatePerDay(rentalRatePerDay);
 }

 // Getters
 public String getVehicleNumber() 
 {
     return vehicleNumber;
 }

 public String getType() 
 {
     return type;
 }

 protected double getRentalRatePerDay() 
 {
     return rentalRatePerDay;
 }

 // Setter with validation
 public void setRentalRatePerDay(double rentalRatePerDay) 
 {
     if (rentalRatePerDay > 0) 
     {
         this.rentalRatePerDay = rentalRatePerDay;
     }
 }

 // Abstract method to calculate rental cost
 public abstract double calculateRentalCost(int days);

 // Common method
 public void displayDetails() 
 {
     System.out.println("Vehicle Number : " + vehicleNumber);
     System.out.println("Type           : " + type);
     System.out.println("Rate / Day     : " + rentalRatePerDay);
 }
}
