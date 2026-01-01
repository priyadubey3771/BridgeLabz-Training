package com.inheritance.hybridinheritance;

public class RestaurantDriver {
  public static void main(String[] args) {

        // Person reference holding subclass objects
        Person p1 = new Chef("Rahul", 101);
        Person p2 = new Waiter("Amit", 102);

        // Array to hold staff members
        Person[] staff = { p1, p2 };

        // Iterate through all staff members
        for (Person p : staff) 
        {
            System.out.println("----------------------");

            // Check type of person and call specific displayInfo()
            if (p instanceof Chef) 
            {
                ((Chef) p).displayInfo();  // Display Chef details
            } 
            else if(p instanceof Waiter) 
            {
                ((Waiter) p).displayInfo();  // Display Waiter details
            }
        }
    }
}
