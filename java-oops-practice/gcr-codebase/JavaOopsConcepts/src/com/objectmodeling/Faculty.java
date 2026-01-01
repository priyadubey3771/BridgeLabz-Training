package com.objectmodeling;

public class Faculty {

 private String facultyName;
 private String specialization;

 // Constructor
 public Faculty(String facultyName, String specialization) 
 {
     this.facultyName = facultyName;
     this.specialization = specialization;
 }

 // Displaying faculty details
 public void displayFacultyDetails() 
 {
     System.out.println("Faculty Name   : " + facultyName);
     System.out.println("Specialization : " + specialization);
 }
}
