package com.objectmodeling;

public class Employee {

 private String employeeName;
 private int employeeId;

 // Constructor
 public Employee(String employeeName, int employeeId) 
 {
     this.employeeName = employeeName;
     this.employeeId = employeeId;
 }

 // Method to display employee details
 public void displayEmployeeDetails() 
 {
     System.out.println("Employee ID   : " + employeeId);
     System.out.println("Employee Name : " + employeeName);
 }
}
