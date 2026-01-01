package com.inheritance.assistedproblems;

//Bird class inherits from Animal
public class Bird extends Animal {

 // Constructor
 public Bird(String name, int age) 
 {
     super(name, age);
 }

 // Override makeSound
 @Override
 public void makeSound() 
 {
     System.out.println(getName() + " says: Chirp Chirp!");
 }
}
