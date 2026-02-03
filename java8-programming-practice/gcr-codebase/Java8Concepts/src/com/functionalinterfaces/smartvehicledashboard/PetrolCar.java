package com.functionalinterfaces.smartvehicledashboard;

public class PetrolCar implements VehicleDashboard {

    @Override
    public void displaySpeed(int speed) 
    {
        System.out.println("Petrol Car Speed: " + speed + " km/h");
    }
}
