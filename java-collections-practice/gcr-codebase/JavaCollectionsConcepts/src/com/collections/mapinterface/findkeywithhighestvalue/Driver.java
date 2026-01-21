package com.collections.mapinterface.findkeywithhighestvalue;

import java.util.HashMap;
import java.util.Map;

public class Driver {
  public static void main(String[] args) {

        // create a map
        Map<String, Integer> scores = new HashMap<>();
        scores.put("A", 10);
        scores.put("B", 20);
        scores.put("C", 15);

        System.out.println("Original Map: " + scores);

        MaxValueKeyFinder finder = new MaxValueKeyFinder();

        // find key with maximum value
        String maxKey = finder.findMaxKey(scores);
        System.out.println("Key with highest value: " + maxKey);
        
    }
}
