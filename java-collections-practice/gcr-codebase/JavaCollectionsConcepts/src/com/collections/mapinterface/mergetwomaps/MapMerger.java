package com.collections.mapinterface.mergetwomaps;

import java.util.HashMap;
import java.util.Map;

// class to merge two maps
public class MapMerger {

    public Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) 
    {
    	Map<String, Integer> mergedMap = new HashMap<>();

        // add all entries from map1
        for (Map.Entry<String, Integer> entry : map1.entrySet()) 
        {
            mergedMap.put(entry.getKey(), entry.getValue());
        }

        // add entries from map2
        for (Map.Entry<String, Integer> entry : map2.entrySet()) 
        {
            mergedMap.put(entry.getKey(), mergedMap.getOrDefault(entry.getKey(), 0) + entry.getValue());
        }

        return mergedMap;
    }
}
