package com.inheritance.hybridinheritance;

//Superclass
public class Person {

 protected String name;
 protected int id;

 // Constructor
 public Person(String name, int id) 
 {
     this.name = name;
     this.id = id;
 }

 //Method to display common person details
 public void displayPersonDetails() 
 {
     System.out.println("Name: " + name);
     System.out.println("ID: " + id);
 }
}
