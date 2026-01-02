package com.encapsulation;

public class Auto extends Vehicle1 {

    public Auto(int vehicleId, String driverName) 
    {
        super(vehicleId, driverName, 10.0);
    }

    @Override
    public double calculateFare(double distance) 
    {
        return distance * getRatePerKm();
    }
}
