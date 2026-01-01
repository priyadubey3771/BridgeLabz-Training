package com.inheritance.assistedproblems;

//Superclass Animal
public abstract class Animal {

 private String name;
 private int age;

 // Constructor
 public Animal(String name, int age) 
 {
     this.name = name;
     this.age = age;
 }

 // Abstract method for subclasses to implement
 public abstract void makeSound();

 // Getters
 public String getName() 
 {
     return name;
 }

 public int getAge() 
 {
     return age;
 }

 // Displaying basic info
 public void displayInfo() 
 {
     System.out.println("Animal: " + name + ", Age: " + age);
 }
}

