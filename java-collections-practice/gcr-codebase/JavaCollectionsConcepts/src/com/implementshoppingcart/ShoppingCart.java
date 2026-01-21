package com.implementshoppingcart;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ShoppingCart {

    //fast price lookup
    private Map<String, Double> priceMap = new HashMap<>();

    // maintains insertion order
    private Map<String, Double> insertionOrderMap = new LinkedHashMap<>();

    // add product to cart
    public void addProduct(Product product)
    {
    	String name = product.getProductName();
        double price = product.getPrice();

        // store in HashMap
        priceMap.put(name, price);

        // store in LinkedHashMap
        insertionOrderMap.put(name, price);
    }

    // display cart items in insertion order
    public void displayCart() 
    {

        System.out.println("\nCart Items (Insertion Order):");
        for (Map.Entry<String, Double> entry : insertionOrderMap.entrySet()) 
        {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        
    }

    // display cart items sorted by price
    public void displaySortedByPrice() 
    {

        // price is used as key
        TreeMap<Double, String> sortedMap = new TreeMap<>();

        for (Map.Entry<String, Double> entry : priceMap.entrySet()) 
        {
            sortedMap.put(entry.getValue(), entry.getKey());
        }

        System.out.println("\nCart Items (Sorted by Price):");
        for (Map.Entry<Double, String> entry : sortedMap.entrySet()) 
        {
            System.out.println(entry.getValue() + " : " + entry.getKey());
        }
        
    }
}
