package tourmate;

import java.util.List;
import java.util.Arrays;

 public class TourMateDriver {
   public static void main(String[] args) {

        // Create Hotel, Transport, and Activities
        Hotel hotel = new Hotel("Sea View Resort", 100, 3);
        Transport transport = new Transport("Flight", 300);
        Activity a1 = new Activity("Snorkeling", 50);
        Activity a2 = new Activity("City Tour", 30);

        // Create and book a Domestic Trip
        Trip domestic = new DomesticTrip("Goa", 3, hotel, transport, Arrays.asList(a1, a2));
        // Book the domestic trip
        domestic.book();   
        // Cancel the domestic trip
        domestic.cancel(); 

        // Create and book an International Trip
        Trip international = new InternationalTrip("Bali", 5, hotel, transport, Arrays.asList(a1, a2),100);
        
        // Book the international trip
        international.book();   
        
        // Cancel the international trip
        international.cancel(); 
    }
}
