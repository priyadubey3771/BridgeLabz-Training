package com.hashmapsandhashfunctions.twosumproblem;

import java.util.HashMap;
import java.util.Map;
public class TwoSum {

    public int[] findTwoSum(int[] arr, int target) 
    {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) 
        {
            int complement = target - arr[i];

            if (map.containsKey(complement)) 
            {
                return new int[]{map.get(complement), i};
            }

            map.put(arr[i], i);
        }

        // No pair found
        return null;
    }
}
