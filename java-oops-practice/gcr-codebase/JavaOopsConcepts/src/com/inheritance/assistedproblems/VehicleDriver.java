package com.inheritance.assistedproblems;

public class VehicleDriver {
   public static void main(String[] args) {

        // references
        Vehicle v1 = new Car(180, "Petrol", 5);
        Vehicle v2 = new Truck(120, "Diesel", 12.5);
        Vehicle v3 = new Motorcycle(140, "Petrol", true);

        // Array of Vehicle type
        Vehicle[] vehicles = { v1, v2, v3 };

        // Dynamic method calls
        for (Vehicle v : vehicles) 
        {
            System.out.println(" ");
            v.displayInfo();
        }
    }
}
