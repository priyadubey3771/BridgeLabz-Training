package thegroceryshoppingapp;

public class SwiftCartDriver {
  public static void main(String[] args) {

        // Create products
        Product milk = new PerishableProduct("Milk", 50);
        Product rice = new NonPerishableProduct("Rice", 100);
        // Create cart
        Cart cart = new Cart();
        // Add products with quantity
        cart.addProduct(milk, 2);
        cart.addProduct(rice, 3);   
        // Apply coupon discount
        cart.applyDiscount(30);

        // Generate final bill
        cart.generateBill();
    }
}
