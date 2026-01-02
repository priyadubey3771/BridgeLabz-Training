package vehicleRentalApplication;

public class VehicleRentalApp {
   public static void main(String[] args) {

        Customer customer = new Customer(1, "Rahul");

        Vehicle bike = new Bike(101, "Honda", 300);
        Vehicle car = new Car(102, "Hyundai", 1200);
        Vehicle truck = new Truck(103, "Tata", 2500);

        customer.displayInfo();
        System.out.println();

        bike.displayInfo();
        System.out.println("Rent for 3 days: ₹" + bike.calculateRent(3));
        System.out.println();

        car.displayInfo();
        System.out.println("Rent for 3 days: ₹" + car.calculateRent(3));
        System.out.println();

        truck.displayInfo();
        System.out.println("Rent for 3 days: ₹" + truck.calculateRent(3));
    }
}
