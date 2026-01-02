package com.encapsulation;

//Bike implementation
public class Bike extends Vehicle implements Insurable {

 private String insurancePolicyNumber;

 public Bike(String vehicleNumber, double rentalRatePerDay, String policyNumber)
 {
     super(vehicleNumber, "Bike", rentalRatePerDay);
     this.insurancePolicyNumber = policyNumber;
 }

 @Override
 public double calculateRentalCost(int days)
 {
     return getRentalRatePerDay() * days;
 }

 // 5% insurance on rental rate
 @Override
 public double calculateInsurance()
 {
     return getRentalRatePerDay() * 0.05;
 }

 @Override
 public String getInsuranceDetails() 
 {
     return "Bike Insurance (Policy No: Hidden)";
 }
}
