package com.inheritance.multilevelinheritance;

public class ShippedOrder extends Order {

	 protected String trackingNumber;

	 // Constructor
	 public ShippedOrder(String orderId, String orderDate, String trackingNumber) 
	 {
	     super(orderId, orderDate);
	     this.trackingNumber = trackingNumber;
	 }

	 @Override
	 public String getOrderStatus() 
	 {
	     return "Order Shipped";
	 }

	 @Override
	 public void displayOrderDetails() 
	 {
	     super.displayOrderDetails();
	     System.out.println("Tracking Number: " + trackingNumber);
	 }
	}
