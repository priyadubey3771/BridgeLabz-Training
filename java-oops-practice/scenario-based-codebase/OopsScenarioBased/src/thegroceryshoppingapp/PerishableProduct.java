package thegroceryshoppingapp;

public class PerishableProduct extends Product {

    public PerishableProduct(String name, double price) 
    {
        super(name, price, "Perishable");
    }

    //discount
    @Override
    public double getDiscount() 
    {
        return price * 0.20;
    }
}
