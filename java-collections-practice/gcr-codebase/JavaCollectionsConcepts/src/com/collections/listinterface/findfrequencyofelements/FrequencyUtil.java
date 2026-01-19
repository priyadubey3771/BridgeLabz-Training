package com.collections.listinterface.findfrequencyofelements;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// utility class containing frequency calculation logic
class FrequencyUtil {

    // method to calculate frequency of each string in the list
    public static Map<String, Integer> findFrequency(List<String> items)
    {
    	Map<String, Integer> frequencyMap = new HashMap<>();

        for (String item : items) 
        {

            // if key already exists, increment count
            if (frequencyMap.containsKey(item)) 
            {
                frequencyMap.put(item, frequencyMap.get(item) + 1);
            }
            // if key does not exist, add with count 1
            else 
            {
                frequencyMap.put(item, 1);
            }
        }

        // return the frequency map
        return frequencyMap;
    }
}
