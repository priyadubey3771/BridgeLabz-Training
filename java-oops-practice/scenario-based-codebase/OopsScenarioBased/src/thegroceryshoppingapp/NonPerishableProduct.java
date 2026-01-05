package thegroceryshoppingapp;

public class NonPerishableProduct extends Product {

    public NonPerishableProduct(String name, double price) 
    {
        super(name, price, "Non-Perishable");
    }

    //discount
    @Override
    public double getDiscount() 
    {
        return price * 0.10;
    }
}
