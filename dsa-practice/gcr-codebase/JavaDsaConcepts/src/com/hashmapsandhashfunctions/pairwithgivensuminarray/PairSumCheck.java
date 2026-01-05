package com.hashmapsandhashfunctions.pairwithgivensuminarray;

import java.util.HashSet;
import java.util.Set;
public class PairSumCheck {

    public boolean hasPairWithSum(int[] arr, int target) 
    {
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) 
        {
            int complement = target - num;
            if (seen.contains(complement)) 
            {
            	// Pair found
                return true; 
            }
            seen.add(num);
        }

     // No pair found
        return false; 
    }
}
