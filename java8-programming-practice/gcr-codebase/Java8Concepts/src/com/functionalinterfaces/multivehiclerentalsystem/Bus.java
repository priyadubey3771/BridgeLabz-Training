package com.functionalinterfaces.multivehiclerentalsystem;

public class Bus implements Vehicle {

    @Override
    public void rent() 
    {
        System.out.println("Bus has been rented for passengers.");
    }

    @Override
    public void returnVehicle() 
    {
        System.out.println("Bus has been returned to the depot.");
    }
}
