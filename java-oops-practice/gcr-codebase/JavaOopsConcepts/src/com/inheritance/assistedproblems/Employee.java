package com.inheritance.assistedproblems;

//Base class representing employee
public class Employee {

 protected String name; 
 protected int id;
 protected double salary;

 // Constructor
 public Employee(String name, int id, double salary) 
 {
     this.name = name;
     this.id = id;
     this.salary = salary;
 }

 // Method to display employee details
 public void displayDetails() 
 {
     System.out.println("Employee Name: " + name);
     System.out.println("Employee ID: " + id);
     System.out.println("Salary: " + salary);
 }
}
