package com.objectmodeling;

import java.util.ArrayList;
public class Professor1 {

 private String professorName;
 private String department;
 private ArrayList<Course1> teachingCourses;

 // Constructor
 public Professor1(String professorName, String department) 
 {
     this.professorName = professorName;
     this.department = department;
     this.teachingCourses = new ArrayList<>();
 }

 // Assign professor to a course
 public void assignCourse(Course1 course) 
 {
     teachingCourses.add(course);
     course.setProfessor(this);
     System.out.println(professorName + " assigned to course " + course.getCourseName());
 }

 // Display courses taught
 public void displayCourses() 
 {
     System.out.println("\nProfessor: " + professorName);
     System.out.println("Teaching Courses:");
     for (Course1 course : teachingCourses) 
     {
         System.out.println("- " + course.getCourseName());
     }
 }

 // Getter
 public String getProfessorName() 
 {
     return professorName;
 }
}
