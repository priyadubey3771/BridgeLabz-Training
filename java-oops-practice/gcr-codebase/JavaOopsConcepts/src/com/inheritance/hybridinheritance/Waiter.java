package com.inheritance.hybridinheritance;

public class Waiter extends Person implements Worker {

 // Constructor calling superclass constructor
 public Waiter(String name, int id) 
 {
     super(name, id);
 }

 // Implementation of Worker interface method
 @Override
 public void performDuties()
 {
     System.out.println("Waiter is serving food to customers.");
 }

 // Display full details of Waiter
 public void displayInfo() 
 {
     // Display common person details
     displayPersonDetails();
     
     // Display waiter-specific duties
     performDuties();
 }
}

