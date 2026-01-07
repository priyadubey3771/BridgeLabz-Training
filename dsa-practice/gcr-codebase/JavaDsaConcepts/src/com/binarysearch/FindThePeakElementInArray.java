package com.binarysearch;

public class FindThePeakElementInArray {
   public static void main(String[] args) {

    int[] arr = {1, 3, 20, 4, 1, 0};
    int index = findPeakElement(arr);
    System.out.println("Peak element index: " + index);
    System.out.println("Peak element value: " + arr[index]);
	    
 }

// Binary Search method to find a peak element
public static int findPeakElement(int[] arr) {

    int left = 0;
    int right = arr.length - 1;

	while (left <= right) 
	{
	
	    int mid = left + (right - left)/ 2;
	
	    // Checking left neighbor
	    boolean leftSmaller = (mid == 0) || (arr[mid] > arr[mid - 1]);
	
	    // Checking right neighbor
	    boolean rightSmaller = (mid == arr.length - 1) || (arr[mid] > arr[mid + 1]);
	
	    // If both neighbors are smaller, mid is peak
	    if (leftSmaller && rightSmaller) 
	    {
	        return mid;
	    }
	
	    // If left neighbor is greater then move to left half
	    if (mid > 0 && arr[mid] < arr[mid - 1]) 
	    {
	        right = mid - 1;
	    }
	    // Else move to right half
	    else 
	    {
	        left = mid + 1;
	    }
	}
	
	return -1;
	        
   }
}



