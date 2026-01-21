package com.fitnesstracker;

public class FitnessTrackerDriver {
   public static void main(String[] args) {

        User[] users = {new User("Aman", 7200), new User("Neha", 9500), new User("Ravi", 6800), new User("Priya", 10500),new User("Kunal", 8000)};

        System.out.println("Before Ranking:");
        for (User u : users) 
        {
            u.display();
        }

        BubbleSort.sort(users);

        System.out.println("\nDaily Step Count Ranking:");
        for (User u : users) 
        {
            u.display();
        }
        
    }
}
