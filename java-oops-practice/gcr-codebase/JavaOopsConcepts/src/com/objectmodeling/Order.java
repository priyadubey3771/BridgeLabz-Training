package com.objectmodeling;

import java.util.ArrayList;
public class Order {

 private int orderId;
 private ArrayList<Product> products;

 // Constructor
 public Order(int orderId) 
 {
     this.orderId = orderId;
     this.products = new ArrayList<>();
 }

 // Add product to order 
 public void addProduct(Product product) 
 {
     products.add(product);
     System.out.println(product.getProductName() + " added to Order " + orderId);
 }

 // Calculate total order amount
 public double calculateTotalAmount() 
 {
     double total = 0;
     for (Product product : products)
     {
         total += product.getPrice();
     }
     return total;
 }

 // Display order details
 public void displayOrderDetails() 
 {
     System.out.println("\nOrder ID: " + orderId);
     System.out.println("Products in Order:");
     for (Product product : products) 
     {
         System.out.println("- " + product.getProductName() + " : ₹" + product.getPrice());
     }
     System.out.println("Total Amount: ₹" + calculateTotalAmount());
 }
}
