package vehicleRentalApplication;

class Car extends Vehicle {

    private double fuelSurcharge = 500;

    public Car(int id, String brand, double rate) 
    {
        super(id, brand, rate);
    }

    @Override
    public double calculateRent(int days) 
    {
        return (baseRate * days) + fuelSurcharge;
    }

    @Override
    public void displayInfo() 
    {
        System.out.println("Car | Brand: " + brand + " | Rate per day: ₹" + baseRate);
    }
}
