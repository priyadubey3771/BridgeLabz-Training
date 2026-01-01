package com.inheritance.hierarchicalinheritance;

public class Staff extends Person {

 private String department;

 public Staff(String name, int age, String department) 
 {
     super(name, age);
     this.department = department;
 }

 @Override
 public String displayRole() 
 {
     return "Staff";
 }

 public void displayInfo() 
 {
     displayDetails();
     System.out.println("Role: " + displayRole());
     System.out.println("Department: " + department);
 }
}
