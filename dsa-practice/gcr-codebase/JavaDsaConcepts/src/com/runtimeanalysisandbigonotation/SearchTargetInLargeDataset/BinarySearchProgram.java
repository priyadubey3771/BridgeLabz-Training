package com.runtimeanalysisandbigonotation.SearchTargetInLargeDataset;

import java.util.Arrays;
 class BinarySearchProgram {

	static int binarySearch(int[] arr, int target) 
	{
        int low = 0, high = arr.length - 1;

        while (low <= high) 
        {
            int mid = low + (high - low) / 2;

            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[mid] < target)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return -1;
    }

     public static void main(String[] args) {
        int[] data = {35, 5, 50, 20, 8, 12};
        int target = 20;

        Arrays.sort(data);

        int result = binarySearch(data, target);

        if (result != -1)
        {
            System.out.println("Element found at index " + result);
        }
        else
        {
            System.out.println("Element not found");
        }
    }
 }



