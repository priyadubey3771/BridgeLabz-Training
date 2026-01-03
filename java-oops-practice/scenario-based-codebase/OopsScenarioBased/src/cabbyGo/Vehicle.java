package cabbyGo;

//Parent class for all vehicle types
class Vehicle {

 protected String vehicleNumber;
 protected String type;
 protected double ratePerKm;

 // Constructor to initialize vehicle details
 public Vehicle(String vehicleNumber, String type, double ratePerKm) 
 {
     this.vehicleNumber = vehicleNumber;
     this.type = type;
     this.ratePerKm = ratePerKm;
 }

 // Method to calculate fare 
 public double calculateFare(double baseFare, double distance) 
 {
     return baseFare + (distance * ratePerKm);
 }

 public String getType() 
 {
     return type;
 }
}
