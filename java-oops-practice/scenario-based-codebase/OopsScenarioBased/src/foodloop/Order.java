package foodloop;

import java.util.List;
//Represents a food order containing multiple food items
public class Order implements IOrderable {

    private List<FoodItem> items; 
    private double total;         

    // Constructor to create a custom combo meal
     
    public Order(List<FoodItem> items) 
    {
        this.items = items;
        calculateTotal();
    }

    //Calculate total price using operators
     
    private void calculateTotal() 
    {
        total = 0;
        for (FoodItem item : items) 
        {
            total += item.getPrice();
        }
        applyDiscount();
    }

    //Discount logic varies based on order total
    
    protected void applyDiscount() 
    {
        if (total >= 1000) 
        {
            total -= total * 0.20;
        } 
        else if(total >= 500) 
        {
            total -= total * 0.10;
        }
    }

    @Override
    public void placeOrder() 
    {
        System.out.println("Order placed successfully!");
        System.out.println("Final Bill Amount: ₹" + total);
    }

    @Override
    public void cancelOrder() 
    {
        System.out.println("Order has been cancelled.");
    }
}
