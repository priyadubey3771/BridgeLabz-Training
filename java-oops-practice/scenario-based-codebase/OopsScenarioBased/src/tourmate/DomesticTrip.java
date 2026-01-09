package tourmate;

import java.util.List;
//Represents a Domestic Trip.
 public class DomesticTrip extends Trip {

    public DomesticTrip(String destination, int duration, Hotel hotel, Transport transport, List<Activity> activities) 
    {
        super(destination, duration, hotel, transport, activities);
    }

    @Override
    public void book() 
    {
        System.out.println("Booking Domestic Trip to " + destination + " for $" + budget);
    }
}
