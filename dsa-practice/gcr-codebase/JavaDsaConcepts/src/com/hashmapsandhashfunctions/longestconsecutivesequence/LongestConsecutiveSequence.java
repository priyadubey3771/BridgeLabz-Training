package com.hashmapsandhashfunctions.longestconsecutivesequence;

import java.util.HashSet;
import java.util.Set;
public class LongestConsecutiveSequence {

    public int findLongestSequence(int[] arr) 
    {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) 
        {
            set.add(num);
        }

        int maxLength = 0;

        for (int num : arr) 
        {
            // Check if num is the start of a sequence
            if (!set.contains(num - 1)) 
            {
                int currentNum = num;
                int length = 1;

                while (set.contains(currentNum + 1)) 
                {
                    currentNum++;
                    length++;
                }

                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }
}
