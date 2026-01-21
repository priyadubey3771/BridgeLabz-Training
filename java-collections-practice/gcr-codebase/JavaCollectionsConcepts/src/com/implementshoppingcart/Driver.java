package com.implementshoppingcart;

public class Driver {
  public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        // add products
        cart.addProduct(new Product("Laptop", 60000));
        cart.addProduct(new Product("Mouse", 800));
        cart.addProduct(new Product("Keyboard", 1500));
        cart.addProduct(new Product("Monitor", 12000));

        // display cart
        cart.displayCart();

        // display cart sorted by price
        cart.displaySortedByPrice();
        
    }
}
