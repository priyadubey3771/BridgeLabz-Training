package medistore;

import java.time.LocalDate;
public abstract class Medicine implements ISellable {

    private String name;       
    private double price;       
    private int quantity;      
    protected LocalDate expiryDate; 

    // Constructor with default quantity = 10
     public Medicine(String name, double price, LocalDate expiryDate) 
    {
        this(name, price, expiryDate, 10);
    }

    //Constructor with custom quantity
    public Medicine(String name, double price, LocalDate expiryDate, int quantity) 
    {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    //Sell medicine and update stock
    @Override
    public void sell(int qty) 
    {
        if (qty <= quantity) 
        {
            quantity -= qty;
            double total = calculateTotalPrice(qty);
            System.out.println(qty + " units sold. Total price: ₹" + total);
        } 
        else 
        {
            System.out.println("Insufficient stock!");
        }
    }

    private double calculateTotalPrice(int qty) 
    {
        double total = price * qty;

        // Apply 10% discount if buying more than 5 units
        if (qty > 5) 
        {
            total = total - (total * 0.10);
        }
        return total;
    }

    // Getter methods
    public String getName() 
    { 
    	return name; 
    }
    public int getQuantity() 
    { 
    	return quantity; 
    }
}
