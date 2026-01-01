package com.inheritance.multilevelinheritance;

//Base class representing order
public class Order {

 protected String orderId;
 protected String orderDate;

 // Constructor
 public Order(String orderId, String orderDate) 
 {
     this.orderId = orderId;
     this.orderDate = orderDate;
 }

 // Method to get order status
 public String getOrderStatus() 
 {
     return "Order Placed";
 }

 // Display order details
 public void displayOrderDetails() 
 {
     System.out.println("Order ID: " + orderId);
     System.out.println("Order Date: " + orderDate);
     System.out.println("Status: " + getOrderStatus());
 }
}

