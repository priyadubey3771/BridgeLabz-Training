package com.objectmodeling;

import java.util.ArrayList;
public class University {

 private String universityName;

 // Composition, University owns Department1 objects
 private ArrayList<Department1> departments;

 // Aggregation, University has Faculty
 private ArrayList<Faculty> faculties;

 // Constructor
 public University(String universityName) 
 {
     this.universityName = universityName;
     this.departments = new ArrayList<>();
     this.faculties = new ArrayList<>();
 }

 // Adding department, Composition
 public void addDepartment(Department1 department) 
 {
     departments.add(department);
 }

 // Adding faculty, Aggregation
 public void addFaculty(Faculty faculty) 
 {
     faculties.add(faculty);
 }

 // Displaying university structure
 public void displayUniversityDetails() 
 {
     System.out.println("University Name: " + universityName);
     System.out.println("\nDepartments:");
     for (Department1 dept : departments) 
     {
         dept.displayDepartmentDetails();
     }

     System.out.println("\nFaculty Members:");
     for (Faculty faculty : faculties) 
     {
         faculty.displayFacultyDetails();
         System.out.println(" ");
     }
 }

 // Delete university
 public void deleteUniversity() 
 {
     departments.clear(); 
     System.out.println("\nUniversity deleted along with all departments.");
 }
}

