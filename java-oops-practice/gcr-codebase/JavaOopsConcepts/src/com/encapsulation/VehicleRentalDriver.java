package com.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalDriver {
  public static void main(String[] args) {

        //Vehicle reference
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", 2000, "CAR-INS-01"));
        vehicles.add(new Bike("BIKE202", 500, "BIKE-INS-02"));
        vehicles.add(new Truck("TRUCK303", 4000, "TRUCK-INS-03"));

        int rentalDays = 3;

        for (Vehicle vehicle : vehicles) 
        {

            vehicle.displayDetails();

            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            double insuranceCost = 0;

            // Interface-based polymorphism
            if (vehicle instanceof Insurable) 
            {
                Insurable insurable = (Insurable) vehicle;
                insuranceCost = insurable.calculateInsurance();
                System.out.println("Insurance     : " + insurable.getInsuranceDetails());
            }

            System.out.println("Rental Cost   : " + rentalCost);
            System.out.println("Insurance Fee : " + insuranceCost);
            System.out.println("----------------------------------");
        }
    }
}
