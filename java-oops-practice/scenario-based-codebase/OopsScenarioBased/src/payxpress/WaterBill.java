package payxpress;

import java.time.LocalDate;
public class WaterBill extends Bill {

    public WaterBill(double amount, LocalDate dueDate) 
    {
        super("Water", amount, dueDate);
    }

    @Override
    public void pay() 
    {
        if (!isPaid()) 
        {
            markPaid();
            System.out.println("Water bill paid successfully.");
        }
    }

    @Override
    public void sendReminder() 
    {
        System.out.println("Reminder: Clear water bill to avoid supply interruption.");
    }
}
