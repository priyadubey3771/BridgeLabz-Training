package tourmate;

import java.util.List;
// Represents an International Trip.
 public class InternationalTrip extends Trip {
    private double insuranceCost; 

    public InternationalTrip(String destination, int duration, Hotel hotel, Transport transport, List<Activity> activities, double insuranceCost) {
        super(destination, duration, hotel, transport, activities);
        this.insuranceCost = insuranceCost;
        budget += insuranceCost; 
    }

    @Override
    public void book() 
    {
        System.out.println("Booking International Trip to " + destination + " with insurance for $" + budget);
    }
}
