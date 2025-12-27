package com.constructor.level1;

public class Manager extends Employee {

 private int teamSize;
 
 // Parameterized constructor
 public Manager(String employeeID, String department, double salary, int teamSize)
 {
     super(employeeID, department, salary);
     this.teamSize = teamSize;
 }

 // Method to display manager details
 public void displayManagerDetails() 
 {
     System.out.println("Employee ID: " + employeeID);   
     System.out.println("Department: " + department);  
     System.out.println("Salary: " + getSalary());    
     System.out.println("Team Size: " + teamSize);
 }
}
