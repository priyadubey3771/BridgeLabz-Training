package com.inheritance.hierarchicalinheritance;

public class Teacher extends Person {

 private String subject;

 public Teacher(String name, int age, String subject) 
 {
     super(name, age);
     this.subject = subject;
 }

 @Override
 public String displayRole()
 {
     return "Teacher";
 }

 public void displayInfo() 
 {
     displayDetails();
     System.out.println("Role: " + displayRole());
     System.out.println("Subject: " + subject);
 }
}
