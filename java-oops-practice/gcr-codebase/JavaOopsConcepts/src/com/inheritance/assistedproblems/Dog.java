package com.inheritance.assistedproblems;

//Dog class inherits from Animal
public class Dog extends Animal {

 // Constructor
 public Dog(String name, int age) 
 {
     super(name, age);
 }

 // Override makeSound
 @Override
 public void makeSound() 
 {
     System.out.println(getName() + " says: Woof Woof!");
 }
}
