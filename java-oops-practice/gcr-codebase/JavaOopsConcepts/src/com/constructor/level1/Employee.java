package com.constructor.level1;

public class Employee {

 public String employeeID;
 protected String department;
 private double salary;

 // Parameterized constructor
 public Employee(String employeeID, String department, double salary) 
 {
     this.employeeID = employeeID;
     this.department = department;
     this.salary = salary;
 }
// Public getter method to access salary
 public double getSalary() 
 {
     return salary;
 }
// Public setter method to modify salary
 public void setSalary(double salary) 
 {
     this.salary = salary;
 }
}
