package com.hashmapsandhashfunctions.twosumproblem;

import java.util.Arrays;
public class Driver {
  public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.findTwoSum(arr, target);

        if (result != null) 
        {
            System.out.println("Indices of elements summing to " + target + ": " + Arrays.toString(result));
        } 
        else 
        {
            System.out.println("No pair found with sum " + target);
        }
    }
}
