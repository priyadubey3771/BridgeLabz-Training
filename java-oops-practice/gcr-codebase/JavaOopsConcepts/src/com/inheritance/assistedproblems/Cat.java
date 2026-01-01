package com.inheritance.assistedproblems;

//Cat class inherits from Animal
public class Cat extends Animal {

 // Constructor
 public Cat(String name, int age)
 {
     super(name, age);
 }

 // Override makeSound
 @Override
 public void makeSound() 
 {
     System.out.println(getName() + " says: Meow Meow!");
 }
}
