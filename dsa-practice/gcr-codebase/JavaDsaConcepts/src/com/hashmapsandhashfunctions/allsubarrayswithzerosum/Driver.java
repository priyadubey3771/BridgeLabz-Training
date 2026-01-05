package com.hashmapsandhashfunctions.allsubarrayswithzerosum;

import java.util.List;
public class Driver {
   public static void main(String[] args) {

        int[] arr = {3, 4, -7, 1, 2, -1, 6, -3, -2};

        ZeroSumSubarrays zeroSum = new ZeroSumSubarrays();
        List<List<Integer>> subarrays = zeroSum.findZeroSumSubarrays(arr);
        System.out.println("Zero-sum subarrays:");
        for (List<Integer> subarray : subarrays) 
        {
            System.out.println(subarray);
        }
    }
}
