package com.smartcheckout;
import java.util.*;

// manages checkout queue and billing
public class SmartCheckoutManager {

    // queue for customers at checkout
    private Queue<Customer> customerQueue = new LinkedList<>();

    // item price map
    private HashMap<String, Integer> priceMap = new HashMap<>();

    // item stock map
    private HashMap<String, Integer> stockMap = new HashMap<>();

    // initialize items, prices, and stock
    public SmartCheckoutManager() 
    {
        priceMap.put("Milk", 50);
        priceMap.put("Bread", 40);
        priceMap.put("Eggs", 10);
        stockMap.put("Milk", 10);
        stockMap.put("Bread", 8);
        stockMap.put("Eggs", 30);
    }

    // add customer to queue
    public void addCustomer(Customer customer) 
    {
        customerQueue.offer(customer);
        System.out.println(customer.name + " added to checkout queue.");
    }

    // process next customer
    public void processNextCustomer() 
    {

        if (customerQueue.isEmpty()) 
        {
            System.out.println("No customers in queue.");
            return;
        }

        Customer customer = customerQueue.poll();
        int totalBill = 0;
        System.out.println("\nBilling customer: " + customer.name);

        for(String item : customer.items) 
        {

            if (stockMap.containsKey(item) && stockMap.get(item) > 0) 
            {

                totalBill += priceMap.get(item);
                stockMap.put(item, stockMap.get(item) - 1);

                System.out.println(item + " purchased for ₹" + priceMap.get(item));
            } 
            else 
            {
                System.out.println(item + " is out of stock.");
            }
        }

        System.out.println("Total Bill Amount: ₹" + totalBill);
    }

    // display remaining stock
    public void displayStock() {
        System.out.println("\nRemaining Stock:");
        for (String item : stockMap.keySet()) 
        {
            System.out.println(item + " → " + stockMap.get(item));
        }
    }
}
