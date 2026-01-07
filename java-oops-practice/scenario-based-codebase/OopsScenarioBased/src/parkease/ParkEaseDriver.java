package parkease;

public class ParkEaseDriver {
   public static void main(String[] args) {

        Vehicle car = new Car("KA01AB1234");
        Vehicle bike = new Bike("KA05XY6789");
        Vehicle truck = new Truck("MH12TR9999");

        ParkingSlot carSlot = new ParkingSlot("C1", "Car");

        ParkingSlot bikeSlot = new ParkingSlot("B1", "Bike");

        System.out.println("\n--- Parking Vehicles ---");
        carSlot.parkVehicle(car);
        bikeSlot.parkVehicle(bike);

        System.out.println("\n--- Releasing Vehicles ---");
        carSlot.releaseVehicle(6);
        bikeSlot.releaseVehicle(4);

        System.out.println("\n--- Truck Attempt ---");
        ParkingSlot truckSlot = new ParkingSlot("T1", "Truck");
        truckSlot.parkVehicle(truck);
        truckSlot.releaseVehicle(5);
        
    }
}
