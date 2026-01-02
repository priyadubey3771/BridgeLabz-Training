package com.encapsulation;

public class RideHailingApp {

    public static void calculateRideFare(Vehicle1 vehicle, double distance) 
    {
        System.out.println("Vehicle ID: " + vehicle.getVehicleId());
        System.out.println("Driver Name: " + vehicle.getDriverName());
        System.out.println("Fare: " + vehicle.calculateFare(distance));
        System.out.println("---------------------------");
    }

    public static void main(String[] args) 
    {

        Vehicle1 car = new Car1(101, "Ramesh");
        Vehicle1 bike = new Bike1(102, "Suresh");
        Vehicle1 auto = new Auto(103, "Mahesh");

        calculateRideFare(car, 10);
        calculateRideFare(bike, 10);
        calculateRideFare(auto, 10);
    }
}
