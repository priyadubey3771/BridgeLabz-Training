package com.objectmodeling;

import java.util.ArrayList;
public class Course {

 private String courseName;
 private ArrayList<Student> students;

 // Constructor
 public Course(String courseName) 
 {
     this.courseName = courseName;
     this.students = new ArrayList<>();
 }

 // Add student to course
 public void addStudent(Student student) 
 {
     students.add(student);
 }

 // Display students enrolled in this course
 public void displayEnrolledStudents() 
 {
     System.out.println("\nCourse: " + courseName);
     for (Student student : students) 
     {
         System.out.println("Student: " + student.getStudentName());
     }
 }

 // Getter
 public String getCourseName() 
 {
     return courseName;
 }
}
