package payxpress;

import java.time.LocalDate;
public class ElectricityBill extends Bill {

    public ElectricityBill(double amount, LocalDate dueDate) 
    {
        super("Electricity", amount, dueDate);
    }

    @Override
    public void pay() 
    {
        if (!isPaid()) 
        {
            markPaid();
            System.out.println("Electricity bill paid successfully.");
        }
    }

    @Override
    public void sendReminder() 
    {
        System.out.println("Reminder: Pay your electricity bill before power disconnection.");
    }
    
}
