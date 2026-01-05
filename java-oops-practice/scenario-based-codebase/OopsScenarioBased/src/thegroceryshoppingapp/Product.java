package thegroceryshoppingapp;

public abstract class Product {

    protected String name;
    protected double price;
    protected String category;

    // Constructor
    public Product(String name, double price, String category) 
    {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Abstract method for discount calculation
    public abstract double getDiscount();

    // Getter methods
    public double getPrice() 
    {
        return price;
    }
    public String getName() 
    {
        return name;
    }
}
