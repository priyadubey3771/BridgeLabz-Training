package com.inheritance.hybridinheritance;

public class Chef extends Person implements Worker {

 // constructor calling superclass constructor
 public Chef(String name, int id) 
 {
     super(name, id);
 }

 // Implementation of Worker interface method
 @Override
 public void performDuties() 
 {
     System.out.println("Chef is preparing delicious meals.");
 }

 // Displaying full details of Chef
 public void displayInfo() 
 {
     // Display common person details
     displayPersonDetails();
     
     // Display chef-specific duties
     performDuties();
 }
}
