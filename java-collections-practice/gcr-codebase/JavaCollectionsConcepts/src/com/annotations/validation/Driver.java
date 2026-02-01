package com.annotations.validation;

public class Driver {
  public static void main(String[] args) {

        try 
        {
            User user1 = new User("Priya");  // Valid
            System.out.println("User1 created: " + user1.getUsername());

            User user2 = new User("PriyaDubey123"); // Invalid, exceeds 10
            System.out.println("User2 created: " + user2.getUsername());

        } 
        catch (IllegalArgumentException e) 
        {
            System.out.println("Validation error: " + e.getMessage());
        }
    }
}
