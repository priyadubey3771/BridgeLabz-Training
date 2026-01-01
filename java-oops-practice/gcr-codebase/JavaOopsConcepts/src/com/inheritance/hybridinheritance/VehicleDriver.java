package com.inheritance.hybridinheritance;

public class VehicleDriver {
  public static void main(String[] args) {

        //Vehicle reference holding subclass objects
        Vehicle v1 = new ElectricVehicle(150, "Tesla Model 3");
        Vehicle v2 = new PetrolVehicle(180, "Honda City");

        // Array of Vehicle objects
        Vehicle[] vehicles = { v1, v2 };

        // Iterate and display vehicle information
        for (Vehicle v : vehicles) 
        {
            System.out.println("---------------------");
            v.displayInfo();
        }
    }
}
