package com.challengeproblem;

import java.util.Arrays;
public class ChallengeForBothLinearAndBinarySearch {
   public static void main(String[] args) {

        int[] arr = {3, 4, -1, 1};
        int target = 4;

        int missing = firstMissingPositive(arr.clone());
        System.out.println("First missing positive number: " + missing);
        Arrays.sort(arr);
        int index = binarySearch(arr, target);
        System.out.println("Index of target " + target + ": " + index);
    }

	   
    // Linear Search: First Missing Positive
    public static int firstMissingPositive(int[] arr) 
    {

        int n = arr.length;
        boolean[] present = new boolean[n + 1];

        // Mark positive numbers
        for (int i = 0; i < n; i++)
        {
            if (arr[i] > 0 && arr[i] <= n) 
            {
                present[arr[i]] = true;
            }
        }

        // Find first missing positive
        for (int i = 1; i <= n; i++) 
        {
            if (!present[i]) 
            {
                return i;
            }
        }

        return n + 1;
    }

	   
// Binary Search: Find Target Index
  public static int binarySearch(int[] arr, int target) {
	
    int left = 0;
    int right = arr.length - 1;
    while (left <= right) 
    {

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) 
        {
            return mid;
        } 
        else if (arr[mid] < target) 
        {
            left = mid + 1;
        }
        else 
        {
            right = mid - 1;
        }
    }
	
 return -1;
	    
    }
}



