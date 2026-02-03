package com.functionalinterfaces.smartvehicledashboard;

public class ElectricCar implements VehicleDashboard {

    @Override
    public void displaySpeed(int speed) 
    {
        System.out.println("Electric Car Speed: " + speed + " km/h");
    }

    @Override
    public void displayBatteryStatus(int percentage) 
    {
        System.out.println("Battery Level: " + percentage + "%");
    }
}
