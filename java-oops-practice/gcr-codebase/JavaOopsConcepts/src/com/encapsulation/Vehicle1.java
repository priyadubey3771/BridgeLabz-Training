package com.encapsulation;

public abstract class Vehicle1 {

    private int vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle1(int vehicleId, String driverName, double ratePerKm) 
    {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public int getVehicleId() 
    {
        return vehicleId;
    }

    public String getDriverName() 
    {
        return driverName;
    }

    public double getRatePerKm() 
    {
        return ratePerKm;
    }

    public abstract double calculateFare(double distance);
}
