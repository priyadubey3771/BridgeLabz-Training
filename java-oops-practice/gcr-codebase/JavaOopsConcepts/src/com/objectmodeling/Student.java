package com.objectmodeling;

import java.util.ArrayList;

public class Student {

 private String studentName;
 private ArrayList<Course> courses;

 // Constructor
 public Student(String studentName) 
 {
     this.studentName = studentName;
     this.courses = new ArrayList<>();
 }

 // Enroll student in a course
 public void enrollCourse(Course course) 
 {
     courses.add(course);
     course.addStudent(this);
 }

 // Display courses enrolled by student
 public void displayEnrolledCourses() 
 {
     System.out.println("\nStudent: " + studentName);
     for (Course course : courses) 
     {
         System.out.println("Enrolled in: " + course.getCourseName());
     }
 }

 // Getter
 public String getStudentName() 
 {
     return studentName;
 }
}
