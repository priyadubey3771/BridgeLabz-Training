package com.constructor.level1;

public class Student {

 public int rollNumber;
 protected String name;
 private double cgpa;

 // Parameterized constructor to initialize student details
 public Student(int rollNumber, String name, double cgpa) 
 {
     this.rollNumber = rollNumber;
     this.name = name;
     this.cgpa = cgpa;
 }
 
 // Public getter method to access CGPA
 public double getCgpa() 
 {
     return cgpa;
 }
 
 // Public setter method to modify CGPA
 public void setCgpa(double cgpa)
 {
     this.cgpa = cgpa;
 }
 
}
