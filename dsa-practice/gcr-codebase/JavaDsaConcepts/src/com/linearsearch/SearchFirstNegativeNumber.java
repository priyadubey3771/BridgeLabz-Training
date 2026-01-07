package com.linearsearch;

public class SearchFirstNegativeNumber {
  public static void main(String[] args) {

        int[] arr = {4, 7, 3, -2, 5, -6};

        int index = findFirstNegative(arr);

        if (index != -1) 
        {
            System.out.println("First negative number found at index: " + index);
            System.out.println("Value: " + arr[index]);
        } 
        else 
        {
            System.out.println("No negative number found");
        }
    }

    // Linear Search method
    public static int findFirstNegative(int[] arr) 
    {

        for (int i = 0; i < arr.length; i++) 
        {

            // Check for negative number
            if (arr[i] < 0) 
            {
            	// return index 
                return i; 
            }
        }

        // no negative number found
        return -1; 
    }
}

