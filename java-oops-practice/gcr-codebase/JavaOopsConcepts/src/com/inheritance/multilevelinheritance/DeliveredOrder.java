package com.inheritance.multilevelinheritance;

public class DeliveredOrder extends ShippedOrder {

	 private String deliveryDate;

	 // Constructor
	 public DeliveredOrder(String orderId, String orderDate,String trackingNumber, String deliveryDate) 
	 {
	     super(orderId, orderDate, trackingNumber);
	     this.deliveryDate = deliveryDate;
	 }

	 @Override
	 public String getOrderStatus() 
	 {
	     return "Order Delivered";
	 }

	 @Override
	 public void displayOrderDetails() 
	 {
	     super.displayOrderDetails();
	     System.out.println("Delivery Date: " + deliveryDate);
	 }
	}
