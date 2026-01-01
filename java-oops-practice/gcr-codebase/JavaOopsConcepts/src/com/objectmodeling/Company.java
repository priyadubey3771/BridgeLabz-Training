package com.objectmodeling;

import java.util.ArrayList;
public class Company {

 private String companyName;
 private ArrayList<Department> departments;

 // Constructor
 public Company(String companyName) 
 {
     this.companyName = companyName;
     this.departments = new ArrayList<>();
 }

 // Method to add department
 public void addDepartment(Department department) 
 {
     departments.add(department);
 }

 // Method to display company structure
 public void displayCompanyDetails() 
 {
     System.out.println("Company Name: " + companyName);

     for (Department dept : departments) 
     {
         dept.displayDepartmentDetails();
     }
 }

 // Method to delete company (Composition behavior)
 public void deleteCompany() 
 {
     departments.clear();
     System.out.println("\nCompany deleted along with all departments and employees.");
 }
}
