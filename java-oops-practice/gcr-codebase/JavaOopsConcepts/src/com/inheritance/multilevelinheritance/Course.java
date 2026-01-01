package com.inheritance.multilevelinheritance;

//Base class representing a course
public class Course {

 protected String courseName;
 protected int duration; 

 // Constructor
 public Course(String courseName, int duration) 
 {
     this.courseName = courseName;
     this.duration = duration;
 }

 // Method to display course details
 public void displayCourseDetails() 
 {
     System.out.println("Course Name: " + courseName);
     System.out.println("Duration: " + duration + " hours");
 }
}
