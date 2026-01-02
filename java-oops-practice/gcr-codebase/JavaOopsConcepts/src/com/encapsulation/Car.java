package com.encapsulation;

//Car implementation
public class Car extends Vehicle implements Insurable {

 // Sensitive data
 private String insurancePolicyNumber;

 public Car(String vehicleNumber, double rentalRatePerDay, String policyNumber) 
 {
     super(vehicleNumber, "Car", rentalRatePerDay);
     this.insurancePolicyNumber = policyNumber;
 }

 @Override
 public double calculateRentalCost(int days) 
 {
     return getRentalRatePerDay() * days;
 }

 // 10% insurance on rental rate
 @Override
 public double calculateInsurance()
 {
     return getRentalRatePerDay() * 0.10;
 }

 @Override
 public String getInsuranceDetails()
 {
     return "Car Insurance (Policy No: Hidden)";
 }
}
