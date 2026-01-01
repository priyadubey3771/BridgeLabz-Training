package com.inheritance.hierarchicalinheritance;

public class Student extends Person {

 private String grade;

 public Student(String name, int age, String grade) 
 {
     super(name, age);
     this.grade = grade;
 }

 @Override
 public String displayRole() 
 {
     return "Student";
 }

 public void displayInfo() 
 {
     displayDetails();
     System.out.println("Role: " + displayRole());
     System.out.println("Grade: " + grade);
 }
}
