package com.encapsulation;

public class Car1 extends Vehicle1 {

    public Car1(int vehicleId, String driverName) 
    {
        super(vehicleId, driverName, 15.0);
    }

    @Override
    public double calculateFare(double distance) 
    {
        return distance * getRatePerKm();
    }
}
