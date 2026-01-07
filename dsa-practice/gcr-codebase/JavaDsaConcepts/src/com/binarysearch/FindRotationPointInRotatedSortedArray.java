package com.binarysearch;

public class FindRotationPointInRotatedSortedArray {
  public static void main(String[] args) {

        int[] arr = {15, 18, 2, 3, 6, 12};
        int index = findRotationPoint(arr);

        System.out.println("Rotation point index: " + index);
        System.out.println("Smallest element: " + arr[index]);
    }

    // Binary Search method
    public static int findRotationPoint(int[] arr) 
    {
    	int left = 0;
        int right = arr.length - 1;

        while (left < right)
        {

        	int mid = left + (right - left) / 2;

            // If mid element is greater than right element,then smallest value is in right half
            if (arr[mid] > arr[right]) 
            {
                left = mid + 1;
            }
            // Otherwise, smallest value is in left half
            else 
            {
                right = mid;
            }
        }

        return left;
    }
}



