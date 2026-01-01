package com.objectmodeling;

import java.util.ArrayList;
public class Student1 {

 private String studentName;
 private int studentId;
 private ArrayList<Course1> enrolledCourses;

 // Constructor
 public Student1(String studentName, int studentId) 
 {
     this.studentName = studentName;
     this.studentId = studentId;
     this.enrolledCourses = new ArrayList<>();
 }

 // Enrolling in a course
 public void enrollCourse(Course1 course) 
 {
     enrolledCourses.add(course);
     course.addStudent(this); 
     System.out.println(studentName + " enrolled in course " + course.getCourseName());
 }

 // Displaying enrolled courses
 public void displayEnrolledCourses() 
 {
     System.out.println("\nStudent: " + studentName);
     System.out.println("Enrolled Courses:");
     for (Course1 course : enrolledCourses) 
     {
         System.out.println("- " + course.getCourseName());
     }
 }

 // Getter
 public String getStudentName() 
 {
     return studentName;
 }
}
