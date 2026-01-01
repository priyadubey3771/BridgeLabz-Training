package com.inheritance.multilevelinheritance;

public class PaidOnlineCourse extends OnlineCourse {

 private double fee;
 private double discount;

 // Constructor
 public PaidOnlineCourse(String courseName, int duration,String platform, boolean isRecorded,double fee, double discount) 
 {
     super(courseName, duration, platform, isRecorded);
     this.fee = fee;
     this.discount = discount;
 }

 // Method to calculate final fee
 private double calculateFinalFee() 
 {
     return fee - (fee * discount / 100);
 }

 @Override
 public void displayCourseDetails() 
 {
     super.displayCourseDetails();
     System.out.println("Course Fee: " + fee);
     System.out.println("Discount: " + discount + "%");
     System.out.println("Final Fee: " + calculateFinalFee());
 }
}
