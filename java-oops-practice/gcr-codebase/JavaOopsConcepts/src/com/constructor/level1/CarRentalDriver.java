package com.constructor.level1;

public class CarRentalDriver {
  public static void main(String[] args) {

        // Using default constructor
        CarRental rental1 = new CarRental();

        // Using parameterized constructor
        CarRental rental2 = new CarRental("Priya Dubey", "Sedan", 3, 1500.0);

        // Displaying total cost for the first rental
        System.out.println("Rental 1 Total Cost: " + rental1.calculateTotalCost());
        // Displaying total cost for the second rental
        System.out.println("Rental 2 Total Cost: " + rental2.calculateTotalCost());
        
      }
   }
