package payxpress;

import java.time.LocalDate;
public class InternetBill extends Bill {

    public InternetBill(double amount, LocalDate dueDate) 
    {
        super("Internet", amount, dueDate);
    }

    @Override
    public void pay() 
    {
        if (!isPaid()) 
        {
            markPaid();
            System.out.println("Internet bill paid successfully.");
        }
    }

    @Override
    public void sendReminder() 
    {
        System.out.println("Reminder: Internet service will be suspended soon.");
    }
    
}
