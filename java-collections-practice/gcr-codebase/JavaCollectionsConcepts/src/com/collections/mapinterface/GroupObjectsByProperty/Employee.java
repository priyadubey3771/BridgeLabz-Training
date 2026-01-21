package com.collections.mapinterface.GroupObjectsByProperty;

public class Employee {
	
	 private String name;
	 private String department;
	
	 // constructor
	 public Employee(String name, String department) 
	 {
	     this.name = name;
	     this.department = department;
	 }
	
	 // getters
	 public String getName() 
	 {
	     return name;
	 }
	
	 public String getDepartment() 
	 {
	     return department;
	 }
	
	 // display employee info
	 @Override
	 public String toString() 
	 {
	     return name;
	 }
}
