package com.tailorshop;

public class TailorShopDriver {
  public static void main(String[] args) {

     // orders received during the day
     Order[] orders = {new Order("O101", "Ravi", 5), new Order("O102", "Neha", 2), new Order("O103", "Amit", 7), new Order("O104", "Pooja", 4)};

     // display orders before sorting
     System.out.println("Orders Before Sorting:");
     for (Order o : orders) 
     {
         o.display();
     }

     InsertionSort.sort(orders);

     // display orders after sorting
     System.out.println("\nOrders Sorted by Delivery Deadline:");
     for (Order o : orders) 
     {
         o.display();
     }
     
  }
}
