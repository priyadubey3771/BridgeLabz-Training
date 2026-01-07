package parkease;

public class ParkingSlot {

    private String slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;

    // Internal booking record (fully encapsulated)
    private Vehicle parkedVehicle;

    public ParkingSlot(String slotId, String vehicleTypeAllowed)
    {
        this.slotId = slotId;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    // Assign vehicle to slot
    public boolean parkVehicle(Vehicle vehicle) 
    {

        if (isOccupied) 
        {
            System.out.println("Slot " + slotId + " is already occupied.");
            return false;
        }

        if (!vehicle.getClass().getSimpleName().equalsIgnoreCase(vehicleTypeAllowed)) 
        {
            System.out.println("Vehicle type not allowed in slot " + slotId);
            return false;
        }

        this.parkedVehicle = vehicle;
        this.isOccupied = true;
        System.out.println("Vehicle parked in slot " + slotId);
        return true;
    }

    // Release vehicle and calculate charges
    public void releaseVehicle(int hours) 
    {

        if (!isOccupied)
        {
            System.out.println("Slot already empty.");
            return;
        }

        double charges = parkedVehicle.calculateCharges(hours);

        System.out.println("Vehicle Number: " + parkedVehicle.getVehicleNumber());
        System.out.println("Parking Duration: " + hours + " hours");
        System.out.println("Total Charges: ₹" + charges);

        // Clear slot
        parkedVehicle = null;
        isOccupied = false;
    }

    // Read-only slot status
    public boolean isAvailable() 
    {
        return !isOccupied;
    }
}
