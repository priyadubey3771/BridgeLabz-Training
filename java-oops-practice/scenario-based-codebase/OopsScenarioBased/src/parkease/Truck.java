package parkease;

public class Truck extends Vehicle {

    public Truck(String vehicleNumber) 
    {
    	//100 per hour
        super(vehicleNumber, 100);
    }

    @Override
    public double calculateCharges(int hours) 
    {
        double charge = baseRate * hours;

        // Higher penalty for overtime
        if (hours > 4) 
        {
            charge += 200;
        }
        return charge;
    }
}
