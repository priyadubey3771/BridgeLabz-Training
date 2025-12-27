package com.constructor.level1;

public class PostgraduateStudent extends Student {

 private String specialization;

 // Parameterized constructor
 public PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) 
 {
     super(rollNumber, name, cgpa);
     this.specialization = specialization;
 }
 
 // Method to display postgraduate student details
 public void displayDetails() {
     System.out.println("Roll Number: " + rollNumber); 
     System.out.println("Name: " + name);               
     System.out.println("CGPA: " + getCgpa());          
     System.out.println("Specialization: " + specialization);
  }
}

