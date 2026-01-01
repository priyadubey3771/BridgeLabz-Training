package com.objectmodeling;

import java.util.ArrayList;
public class Department {

 private String departmentName;
 private ArrayList<Employee> employees;

 // Constructor
 public Department(String departmentName) 
 {
     this.departmentName = departmentName;
     this.employees = new ArrayList<>();
 }

 // Method to add employee to department
 public void addEmployee(String name, int id) 
 {
     employees.add(new Employee(name, id)); 
 }

 // Method to display department details
 public void displayDepartmentDetails() 
 {
     System.out.println("\nDepartment Name: " + departmentName);

     for (Employee emp : employees) 
     {
         emp.displayEmployeeDetails();
         System.out.println(" ");
     }
 }
}
