package vehicleRentalApplication;

class Truck extends Vehicle {

    private double heavyLoadCharge = 1000;

    public Truck(int id, String brand, double rate) 
    {
        super(id, brand, rate);
    }

    @Override
    public double calculateRent(int days) 
    {
        return (baseRate * days) + heavyLoadCharge;
    }

    @Override
    public void displayInfo() 
    {
        System.out.println("Truck | Brand: " + brand + " | Rate per day: ₹" + baseRate);
    }
}
