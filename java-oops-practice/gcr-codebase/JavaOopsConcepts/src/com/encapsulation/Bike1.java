package com.encapsulation;

public class Bike1 extends Vehicle1 {

    public Bike1(int vehicleId, String driverName) 
    {
        super(vehicleId, driverName, 8.0);
    }

    @Override
    public double calculateFare(double distance) 
    {
        return distance * getRatePerKm();
    }
}
