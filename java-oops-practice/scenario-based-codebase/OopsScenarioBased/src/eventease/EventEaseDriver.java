package eventease;

public class EventEaseDriver {
  public static void main(String[] args) {

        User user1 = new User("Priya Dubey", "priya@email.com");

        Event event1 = new BirthdayEvent(101,"Priya's Birthday","Mumbai","15-Mar-2026",50,50000,15000,5000,user1);
        Event event2 = new ConferenceEvent(201,"Tech Conference","Bangalore","10-Apr-2026",300,200000,user1);

        Event[] events = { event1, event2 };
        for (Event e : events) 
        {
            System.out.println("\n ");
            e.schedule();
            e.displayEventDetails();
        }
    }
}
