package com.constructor.level1;

public class Course {

 private String courseName;
 private int duration;     
 private double fee;
 private static String instituteName = "ABC Institute";

 // Parameterized constructor to initialize course details
 public Course(String courseName, int duration, double fee)
 {
     this.courseName = courseName;
     this.duration = duration;
     this.fee = fee;
 }

 // Method to display details of a particular course
 public void displayCourseDetails()
 {
     System.out.println("Course Name: " + courseName);
     System.out.println("Duration: " + duration + " weeks");
     System.out.println("Fee: " + fee);
     System.out.println("Institute: " + instituteName);
 }

 //Method to update institute name for all courses
 public static void updateInstituteName(String newInstituteName)
 {
     instituteName = newInstituteName;
 }
}
