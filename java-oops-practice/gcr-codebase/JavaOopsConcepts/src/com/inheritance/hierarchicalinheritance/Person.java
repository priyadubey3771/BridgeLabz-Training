package com.inheritance.hierarchicalinheritance;

//Superclass representing a common person in a school
public class Person {

 protected String name;
 protected int age;

 // Constructor
 public Person(String name, int age) 
 {
     this.name = name;
     this.age = age;
 }

 // Common method
 public void displayDetails() 
 {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }

 // Method to be overridden
 public String displayRole() 
 {
     return "Person";
 }
}
