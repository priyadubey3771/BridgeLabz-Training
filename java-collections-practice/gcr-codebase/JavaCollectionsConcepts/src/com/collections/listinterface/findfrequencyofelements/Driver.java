package com.collections.listinterface.findfrequencyofelements;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Driver {
   public static void main(String[] args) {

        // creating input list
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");

        // finding frequency of elements
        Map<String, Integer> result = FrequencyUtil.findFrequency(fruits);

        // displaying result
        System.out.println("Input List: " + fruits);
        System.out.println("Frequency Map: " + result);
        
    }
}
