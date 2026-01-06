package com.sorting;

public class MergeSort {

    // Method to divide the array
    static void mergeSort(int[] prices, int left, int right) 
    {
        if (left < right) 
        {

            int mid = (left + right) / 2;

            // Sorting left half
            mergeSort(prices, left, mid);

            // Sorting right half
            mergeSort(prices, mid + 1, right);

            // Merging both halves
            merge(prices, left, mid, right);
        }
    }

    // Method to merge two sorted halves
    static void merge(int[] prices, int left, int mid, int right) 
    {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data into temporary arrays
        for (int i = 0; i < n1; i++)
        {
            leftArray[i] = prices[left + i];
        }

        for (int j = 0; j < n2; j++)
        {	
            rightArray[j] = prices[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        // Merging the arrays
        while (i < n1 && j < n2) 
        {
            if (leftArray[i] <= rightArray[j]) 
            {
                prices[k] = leftArray[i];
                i++;
            }
            else 
            {
                prices[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copying remaining elements
        while (i < n1) 
        {
            prices[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) 
        {
            prices[k] = rightArray[j];
            j++;
            k++;
        }
    }

   public static void main(String[] args) {

        // Array of book prices
        int[] prices = {450, 299, 999, 150, 600};

        // Applying Merge Sort
        mergeSort(prices, 0, prices.length - 1);

        // Printing sorted prices
        System.out.println("Book prices in ascending order:");
        for (int price : prices) 
        {
            System.out.print(price + " ");
        }
    }
}
