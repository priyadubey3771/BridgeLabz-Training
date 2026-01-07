package parkease;

// Car parking charge calculation
 public class Car extends Vehicle {

	public Car(String vehicleNumber) 
    {
        super(vehicleNumber, 50);
    }

    @Override
    public double calculateCharges(int hours) 
    {
        double charge = baseRate * hours;
        // Penalty if parked more than 5 hours
        if (hours > 5) 
        {
            charge += 100;
        }
        return charge;
    }
}
