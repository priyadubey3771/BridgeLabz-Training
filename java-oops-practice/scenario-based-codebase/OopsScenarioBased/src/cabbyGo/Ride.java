package cabbyGo;

//Ride class handles booking and ending rides
class Ride implements Rideable {

 private Vehicle vehicle;
 private Driver driver;
 private double fare;       
 private boolean active;
 private final double baseFare = 50;

 // Constructor
 public Ride(Vehicle vehicle, Driver driver)
 {
     this.vehicle = vehicle;
     this.driver = driver;
 }

 // Book a ride
 @Override
 public void bookRide(double distance) 
 {
     fare = vehicle.calculateFare(baseFare, distance);
     active = true;

     System.out.println("Ride booked successfully");
     System.out.println("Driver: " + driver.getName());
     System.out.println("Vehicle: " + vehicle.getType());
 }

 // End a ride
 @Override
 public void endRide() 
 {
     if (active) 
     {
         active = false;
         System.out.println("Ride ended");
         System.out.println("Total Fare: ₹" + fare);
     }
     else 
     {
         System.out.println("No active ride");
     }
 }
}
