package com.objectmodeling;

import java.util.ArrayList;
public class School{

 private String schoolName;
 private ArrayList<Student> students;

 // Constructor
 public School(String schoolName) 
 {
     this.schoolName = schoolName;
     this.students = new ArrayList<>();
 }

 // Add student to school
 public void addStudent(Student student)
 {
     students.add(student);
 }

 // Display students in school
 public void displaySchoolStudents() 
 {
     System.out.println("\nSchool Name: " + schoolName);
     for (Student student : students) 
     {
         System.out.println("Student: " + student.getStudentName());
     }
 }
}

