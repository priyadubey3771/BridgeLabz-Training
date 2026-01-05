package com.hashmapsandhashfunctions.allsubarrayswithzerosum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZeroSumSubarrays {
	
  public List<List<Integer>> findZeroSumSubarrays(int[] arr) 
  {
	    Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();

        int sum = 0;

        for (int i = 0; i < arr.length; i++) 
        {
            sum += arr[i];

            // Subarray from index 0 to i has zero sum
            if (sum == 0) 
            {
                List<Integer> subarray = new ArrayList<>();
                for (int j = 0; j <= i; j++)
                {
                    subarray.add(arr[j]);
                }
                result.add(subarray);
            }

            // If sum has been seen before, there are subarrays with zero sum
            if (map.containsKey(sum)) 
            {
                for (int startIndex : map.get(sum)) 
                {
                    List<Integer> subarray = new ArrayList<>();
                    for (int j = startIndex + 1; j <= i; j++) 
                    {
                        subarray.add(arr[j]);
                    }
                    result.add(subarray);
                }
            }

            // Add current index to map
            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }

        return result;
    }
}
