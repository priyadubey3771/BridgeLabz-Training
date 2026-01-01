package com.objectmodeling;

public class Customer1 {

 private String customerName;

 // Constructor
 public Customer1(String customerName) 
 {
     this.customerName = customerName;
 }

 // Customer1 places an order
 public void placeOrder(Order order) 
 {
     System.out.println("\nCustomer " + customerName + " placed an order.");
     order.displayOrderDetails();
 }
}
