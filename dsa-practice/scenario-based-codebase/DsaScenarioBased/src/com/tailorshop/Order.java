package com.tailorshop;

class Order {

	 String orderId;
	 String customerName;
	 int deliveryDay;
	
	 // constructor 
	 Order(String orderId, String customerName, int deliveryDay) 
	 {
	     this.orderId = orderId;
	     this.customerName = customerName;
	     this.deliveryDay = deliveryDay;
	 }
	
	 // displaying order details
	 void display() 
	 {
	     System.out.println( "Order ID: " + orderId +", Customer: " + customerName +", Delivery Day: " + deliveryDay);
	 }
	 
}
