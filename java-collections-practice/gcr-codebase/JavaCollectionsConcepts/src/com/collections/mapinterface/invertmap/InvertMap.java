package com.collections.mapinterface.invertmap;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class InvertMap {

     // method to invert a map
    public <K, V> Map<V, List<K>> invert(Map<K, V> originalMap) 
    {
        Map<V, List<K>> invertedMap = new HashMap<>();

        for (Map.Entry<K, V> entry : originalMap.entrySet()) 
        {
            K key = entry.getKey();
            V value = entry.getValue();

            // if value already exists in inverted map, add key to list
            invertedMap.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }

        return invertedMap;
    }
}
