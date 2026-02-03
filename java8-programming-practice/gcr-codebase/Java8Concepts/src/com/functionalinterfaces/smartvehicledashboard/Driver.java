package com.functionalinterfaces.smartvehicledashboard;

public class Driver {
  public static void main(String[] args) {

        VehicleDashboard petrolCar = new PetrolCar();
        VehicleDashboard electricCar = new ElectricCar();

        petrolCar.displaySpeed(80);
        petrolCar.displayBatteryStatus(0);  

        electricCar.displaySpeed(100);
        electricCar.displayBatteryStatus(85); 
    }
}
