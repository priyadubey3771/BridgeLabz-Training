package com.collections.mapinterface.mergetwomaps;

import java.util.HashMap;
import java.util.Map;

public class Driver {
  public static void main(String[] args) {

        // Map 1
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        // Map 2
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        System.out.println("Map 1: " + map1);
        System.out.println("Map 2: " + map2);

        // merge maps
        MapMerger merger = new MapMerger();
        Map<String, Integer> mergedMap = merger.mergeMaps(map1, map2);

        System.out.println("Merged Map: " + mergedMap);
        
    }
}

