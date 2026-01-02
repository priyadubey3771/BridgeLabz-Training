package com.encapsulation;

//Truck implementation
public class Truck extends Vehicle implements Insurable {

 private String insurancePolicyNumber;

 public Truck(String vehicleNumber, double rentalRatePerDay, String policyNumber) 
 {
     super(vehicleNumber, "Truck", rentalRatePerDay);
     this.insurancePolicyNumber = policyNumber;
 }

 @Override
 public double calculateRentalCost(int days) 
 {
     return (getRentalRatePerDay() * days) + 1000;
 }

 // 15% insurance on rental rate
 @Override
 public double calculateInsurance() 
 {
     return getRentalRatePerDay() * 0.15;
 }

 @Override
 public String getInsuranceDetails() 
 {
     return "Truck Insurance (Policy No: Hidden)";
 }
}
