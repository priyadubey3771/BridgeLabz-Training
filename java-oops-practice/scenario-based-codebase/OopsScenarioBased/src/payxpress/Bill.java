package payxpress;

import java.time.LocalDate;
// abstract base class for all bills
public abstract class Bill implements IPayable {

    private String type;
    protected double amount;
    protected LocalDate dueDate;
    private boolean isPaid;

    // constructor for recurring bills
    public Bill(String type, double amount, LocalDate dueDate) 
    {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    // encapsulation
    public final void markPaid() 
    {
        this.isPaid = true;
    }

    protected boolean isPaid() 
    {
        return isPaid;
    }

    // late fee calculation
    protected double calculateLateFee(double penalty) 
    {
        return amount + penalty;
    }

    public String getType() 
    {
        return type;
    }

    // abstract methods
    @Override
    public abstract void pay();

    @Override
    public abstract void sendReminder();
}
