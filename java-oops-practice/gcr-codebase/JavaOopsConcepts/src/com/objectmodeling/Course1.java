package com.objectmodeling;

import java.util.ArrayList;
public class Course1 {

 private String courseName;
 private Professor1 professor; 
 private ArrayList<Student1> students; 

 // Constructor
 public Course1(String courseName) 
 {
     this.courseName = courseName;
     this.students = new ArrayList<>();
 }

 // Set professor for this course
 public void setProfessor(Professor1 professor) 
 {
     this.professor = professor;
 }

 // Add student to this course
 public void addStudent(Student1 student) 
 {
     students.add(student);
 }

 // Display course details
 public void displayCourseDetails() 
 {
     System.out.println("\nCourse: " + courseName);
     if (professor != null) 
     {
         System.out.println("Professor: " + professor.getProfessorName());
     } 
     else 
     {
         System.out.println("Professor not assigned yet");
     }

     System.out.println("Enrolled Students:");
     for (Student1 student : students) 
     {
         System.out.println("- " + student.getStudentName());
     }
 }

 // Getter
 public String getCourseName() 
 {
     return courseName;
 }
}
