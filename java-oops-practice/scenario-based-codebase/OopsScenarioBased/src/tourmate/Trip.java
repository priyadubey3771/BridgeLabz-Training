package tourmate;

import java.util.List;
public class Trip implements IBookable {
    protected String destination;          
    protected double budget;               
    protected int duration;                
    protected Hotel hotel;                 
    protected Transport transport;         
    protected List<Activity> activities;   

    // Constructor to initialize a trip with all services
    public Trip(String destination, int duration, Hotel hotel, Transport transport, List<Activity> activities) 
    {
        this.destination = destination;
        this.duration = duration;
        this.hotel = hotel;
        this.transport = transport;
        this.activities = activities;
        calculateBudget();
    }

    //Calculates total budget as
    private void calculateBudget() 
    {
        double totalActivities = 0;
        for (Activity a : activities) 
        {
            totalActivities += a.getCost();
        }
        budget = hotel.getTotalCost() + transport.getCost() + totalActivities;
    }

    public double getBudget() 
    { 
    	return budget; 
    }

    @Override
    public void book() 
    {
        System.out.println("Booking trip to " + destination + " with total budget: $" + budget);
    }

    @Override
    public void cancel()
    {
        System.out.println("Cancelling trip to " + destination);
    }
}
