package com.encapsulation;

//Abstract class representing Employee
public abstract class Employee {

 // Encapsulated fields
 private int employeeId;
 private String name;
 private double baseSalary;

 // Constructor
 public Employee(int employeeId, String name, double baseSalary) 
 {
     this.employeeId = employeeId;
     this.name = name;
     this.baseSalary = baseSalary;
 }

 // Getters 
 public int getEmployeeId() 
 {
     return employeeId;
 }

 public String getName() 
 {
     return name;
 }

 protected double getBaseSalary() 
 {
     return baseSalary;
 }

 // Abstract method
 public abstract double calculateSalary();

 // Concrete method
 public void displayDetails() 
 {
     System.out.println("Employee ID   : " + employeeId);
     System.out.println("Name          : " + name);
     System.out.println("Salary        : " + calculateSalary());
 }
}
