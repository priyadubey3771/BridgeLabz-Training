package parkease;

public class Bike extends Vehicle {

    public Bike(String vehicleNumber) 
    {
        super(vehicleNumber, 20);
    }

    @Override
    public double calculateCharges(int hours)
    {
        double charge = baseRate * hours;
        // Penalty if parked more than 6 hours
        if (hours > 6)
        {
            charge += 50;
        }
        return charge;
    }
}
