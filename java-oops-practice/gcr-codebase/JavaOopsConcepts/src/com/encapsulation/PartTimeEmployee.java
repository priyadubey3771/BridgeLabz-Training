package com.encapsulation;

//part-time employee implementation
public class PartTimeEmployee extends Employee implements Department {

 private int hoursWorked;
 private double hourlyRate;
 private String department;

 public PartTimeEmployee(int employeeId, String name, int hoursWorked, double hourlyRate) 
 {
     super(employeeId, name, 0);
     this.hoursWorked = hoursWorked;
     this.hourlyRate = hourlyRate;
 }

 // salary based on hours worked
 @Override
 public double calculateSalary() 
 {
     return hoursWorked * hourlyRate;
 }

 @Override
 public void assignDepartment(String departmentName) 
 {
     this.department = departmentName;
 }

 @Override
 public String getDepartmentDetails() 
 {
     return department;
 }
}
