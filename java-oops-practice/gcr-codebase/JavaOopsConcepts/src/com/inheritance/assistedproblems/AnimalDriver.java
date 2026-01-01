package com.inheritance.assistedproblems;

//demonstrating polymorphism
public class AnimalDriver {
  public static void main(String[] args) {

     //Animal reference can hold any subclass
     Animal a1 = new Dog("Buddy", 3);
     Animal a2 = new Cat("Whiskers", 2);
     Animal a3 = new Bird("Tweety", 1);

     // Displaying info and sounds
     a1.displayInfo();
     a1.makeSound();
     a2.displayInfo();
     a2.makeSound();
     a3.displayInfo();
     a3.makeSound();

     // Demonstrating array of Animals
     Animal[] animals = {a1, a2, a3};
     System.out.println("\nIterating through animals array:");
     for (Animal animal : animals) 
     {
         animal.displayInfo();
         animal.makeSound();
     }
 }
}
