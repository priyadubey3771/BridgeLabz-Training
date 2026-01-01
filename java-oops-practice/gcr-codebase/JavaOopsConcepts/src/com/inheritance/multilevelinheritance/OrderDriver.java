package com.inheritance.multilevelinheritance;

public class OrderDriver {
	  public static void main(String[] args) {

	        // multilevel inheritance
	        Order order1 = new Order("ORD101", "01-09-2025");
	        Order order2 = new ShippedOrder("ORD102", "02-09-2025", "TRK56789");
	        Order order3 = new DeliveredOrder("ORD103", "03-09-2025","TRK98765", "06-09-2025");

	        Order[] orders = { order1, order2, order3 };

	        for (Order order : orders) 
	        {
	            System.out.println("-------------------------------------- ");
	            order.displayOrderDetails();
	        }
	    }
	}
