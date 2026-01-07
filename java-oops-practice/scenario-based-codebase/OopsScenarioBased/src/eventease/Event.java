package eventease;

public abstract class Event implements ISchedulable {

    private final int eventId;   
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    // Pricing is encapsulated
    private double venueCost;
    private double serviceCost;
    private double discount;
    protected User organizer;

    // Constructor
    public Event(int eventId, String eventName, String location, String date, int attendees, double venueCost, User organizer) 
    {
        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.venueCost = venueCost;
        this.organizer = organizer;
        this.serviceCost = 0;
        this.discount = 0;
    }

    // Constructor with services
    public Event(int eventId, String eventName, String location, String date,int attendees, double venueCost, double serviceCost,double discount, User organizer)
    {
        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.venueCost = venueCost;
        this.serviceCost = serviceCost;
        this.discount = discount;
        this.organizer = organizer;
    }

    // Calculate total cost
    protected double calculateTotalCost() 
    {
        return venueCost + serviceCost - discount;
    }

    //display method
    public void displayEventDetails() 
    {
        System.out.println("Event ID: " + eventId);
        System.out.println("Event Name: " + eventName);
        System.out.println("Location: " + location);
        System.out.println("Date: " + date);
        System.out.println("Attendees: " + attendees);
        System.out.println("Organizer: " + organizer.getName());
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }

    // Abstract scheduling behavior
    @Override
    public abstract void schedule();
}
