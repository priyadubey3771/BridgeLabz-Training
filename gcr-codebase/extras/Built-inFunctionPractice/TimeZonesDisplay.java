
import java.time.ZoneId;
import java.time.ZonedDateTime;
public class TimeZonesDisplay{

    // Method to display current time for a given time zone
    static void displayTime(String zoneName)
    {
		ZoneId zoneId= ZoneId.of(zoneName);
        ZonedDateTime currentTime= ZonedDateTime.now(zoneId);
		System.out.println(zoneName+" Time : "+currentTime);
    }

    public static void main(String[] args)
    {
        System.out.println("Current Time in Different Time Zones\n");

        // GMT Time
        displayTime("GMT");

        // IST Time
        displayTime("Asia/Kolkata");

        // PST Time
        displayTime("America/Los_Angeles");
    }
  }
