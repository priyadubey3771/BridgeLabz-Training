package cabbyGo;

public class CabbyGoApp {
   public static void main(String[] args) {

        // Creating vehicle objects
        Vehicle mini = new Mini("MH12AB1234");
        Vehicle sedan = new Sedan("MH14CD5678");

        // Creating driver
        Driver driver = new Driver("Rahul", "LIC7890", 4.6);

        // Booking Mini ride
        Ride ride1 = new Ride(mini, driver);
        ride1.bookRide(10);
        ride1.endRide();

        System.out.println();

        // Booking Sedan ride
        Ride ride2 = new Ride(sedan, driver);
        ride2.bookRide(8);
        ride2.endRide();
    }
}
