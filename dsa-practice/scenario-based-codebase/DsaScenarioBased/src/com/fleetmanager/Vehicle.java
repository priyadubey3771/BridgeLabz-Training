package com.fleetmanager;

// represents a vehicle in the fleet
class Vehicle {

    String vehicleId;
    int mileage;   
    
    // constructor
    public Vehicle(String vehicleId, int mileage) 
    {
        this.vehicleId = vehicleId;
        this.mileage = mileage;
    }

    // display vehicle details
    public void display() 
    {
        System.out.println(vehicleId + " | Mileage: " + mileage);
    }
}
