package com.functionalinterfaces.smartvehicledashboard;

public interface VehicleDashboard {

    void displaySpeed(int speed);
    default void displayBatteryStatus(int percentage) 
    {
        System.out.println("Battery feature not supported for this vehicle.");
    }
}
