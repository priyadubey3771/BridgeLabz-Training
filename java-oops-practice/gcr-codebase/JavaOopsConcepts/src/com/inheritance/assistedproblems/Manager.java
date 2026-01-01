package com.inheritance.assistedproblems;

//Manager is Employee
public class Manager extends Employee {

 private int teamSize;

 public Manager(String name, int id, double salary, int teamSize) 
 {
	// calling superclass constructor
     super(name, id, salary); 
     this.teamSize = teamSize;
 }

 @Override
 public void displayDetails() 
 {
     super.displayDetails();
     System.out.println("Team Size: " + teamSize);
 }
}