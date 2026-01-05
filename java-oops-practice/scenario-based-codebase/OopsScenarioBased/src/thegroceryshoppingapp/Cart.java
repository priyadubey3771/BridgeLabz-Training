package thegroceryshoppingapp;

import java.util.ArrayList;
public class Cart implements ICheckout {

    private ArrayList<Product> products;
    private double totalPrice;

    // Default constructor
    public Cart() 
    {
        products = new ArrayList<>();
        totalPrice = 0.0;
    }

    // Constructor with pre-selected items
    public Cart(ArrayList<Product> products) 
    {
        this.products = products;
        calculateTotal();
    }

    // Add product to cart
    public void addProduct(Product product, int quantity)
    {
        products.add(product);
        totalPrice += product.getPrice() * quantity; 
    }

    // Calculate total price
    private void calculateTotal()
    {
        for (Product product : products) 
        {
            totalPrice += product.getPrice();
        }
    }

    // Apply discount using operator
    @Override
    public void applyDiscount(double couponAmount) 
    {
        totalPrice = totalPrice - couponAmount;
    }

    // Generate bill
    @Override
    public void generateBill() 
    {
        System.out.println("SwiftCart Bill");

        double discount = 0;
        for (Product product : products) 
        {
            System.out.println("Product: " + product.getName() + " | Price: " + product.getPrice());
            discount += product.getDiscount(); 
        }

        totalPrice = totalPrice - discount;

        System.out.println("Total Discount: " + discount);
        System.out.println("Final Amount Payable: " + totalPrice);
    }
}
