package com.constructor.level1;

public class VehicleDriver {
  public static void main(String[] args) {

     Vehicle vehicle1 = new Vehicle("Amit Sharma", "Car");
     Vehicle vehicle2 = new Vehicle("Priya Dubey", "Motorcycle");

     // Displaying vehicle details before updating registration fee
     vehicle1.displayVehicleDetails();
     System.out.println();
     vehicle2.displayVehicleDetails();

     System.out.println("\nUpdating Registration Fee...\n");
     // Updating registration fee 
     Vehicle.updateRegistrationFee(6000.0);

     // Displaying vehicle details after updating registration fee
     vehicle1.displayVehicleDetails();
     System.out.println();
     vehicle2.displayVehicleDetails();
  }
 }
