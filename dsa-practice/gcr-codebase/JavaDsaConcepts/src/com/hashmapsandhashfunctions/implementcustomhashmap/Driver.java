package com.hashmapsandhashfunctions.implementcustomhashmap;

public class Driver {
  public static void main(String[] args) {

        CustomHashMap map = new CustomHashMap(10);

        // Insert key-value pairs
        map.put(1, 100);
        map.put(2, 200);
        // Collides with key 2 if bucketSize = 10
        map.put(12, 1200); 

        // Retrieve values
        System.out.println("Value for key 1: " + map.get(1)); 
        System.out.println("Value for key 12: " + map.get(12)); 

        // Update key
        map.put(1, 101);
        System.out.println("Updated value for key 1: " + map.get(1)); 

        // Remove key
        map.remove(2);
        System.out.println("Value for key 2 after removal: " + map.get(2)); 
    }
}
