package com.constructor.level1;

public class CarRental{

    private String customerName;
    private String carModel;
    private int rentalDays;
    private double costPerDay;

    // Default constructor
    public CarRental() 
    {
        this.customerName = "Customer";
        this.carModel = "Standard";
        this.rentalDays = 1;
        this.costPerDay = 1000.0;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays, double costPerDay) 
    {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = costPerDay;
    }

    // Method to calculate total rental cost
    public double calculateTotalCost() 
    {
        return rentalDays * costPerDay;
    }

   // Getter method to return customer name
    public String getCustomerName() 
    {
        return customerName;
    }
    
   // Getter method to return car model
    public String getCarModel() 
    {
        return carModel;
    }

   // Getter method to return number of rental days
    public int getRentalDays() 
    {
        return rentalDays;
    }
}
