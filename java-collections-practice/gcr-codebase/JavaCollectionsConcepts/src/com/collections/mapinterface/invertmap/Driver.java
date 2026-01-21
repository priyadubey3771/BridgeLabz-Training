package com.collections.mapinterface.invertmap;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Driver {
  public static void main(String[] args) {

        // original map
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 1);

        System.out.println("Original Map: " + originalMap);

        InvertMap inverter = new InvertMap();

        // invert the map
        Map<Integer, List<String>> invertedMap = inverter.invert(originalMap);

        System.out.println("Inverted Map: " + invertedMap);
        
    }
}
