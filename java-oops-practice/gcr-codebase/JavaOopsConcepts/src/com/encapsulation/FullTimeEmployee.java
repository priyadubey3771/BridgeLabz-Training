package com.encapsulation;

//Full time employee implementation
public class FullTimeEmployee extends Employee implements Department {

 private String department;

 public FullTimeEmployee(int employeeId, String name, double baseSalary) 
 {
     super(employeeId, name, baseSalary);
 }

 // Fixed salary for full time employees
 @Override
 public double calculateSalary() 
 {
     return getBaseSalary();
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
