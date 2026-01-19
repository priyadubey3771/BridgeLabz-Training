package com.multileveluniversitycoursemanagementsystem;

//Generic Course class
class Course<T extends CourseType> {

 // course details
 private String courseName;
 private String department;
 private T courseType;

 // constructor 
 public Course(String courseName, String department, T courseType) 
 {
     this.courseName = courseName;
     this.department = department;
     this.courseType = courseType;
 }

 // getter for course name
 public String getCourseName() 
 {
     return courseName;
 }

 // getter for department
 public String getDepartment() 
 {
     return department;
 }

 // getter for course type
 public T getCourseType() 
 {
     return courseType;
 }
}
