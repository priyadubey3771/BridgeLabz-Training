package tourmate;

//Represents a hotel stay in a trip
 public class Hotel {
    private String name;         
    private double pricePerNight; 
    private int nights;           

    public Hotel(String name, double pricePerNight, int nights) 
    {
        this.name = name;
        this.pricePerNight = pricePerNight;
        this.nights = nights;
    }

    // Calculate total hotel cost
    public double getTotalCost() 
    { 
        return pricePerNight * nights; 
    }

    public String getName() 
    { 
    	return name; 
    }
}
