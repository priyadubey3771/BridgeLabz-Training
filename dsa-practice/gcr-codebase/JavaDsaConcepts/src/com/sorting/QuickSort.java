package com.sorting;

public class QuickSort {

    // Method to apply Quick Sort
    static void quickSort(int[] prices, int low, int high) 
    {
        if (low < high) 
        {

            //partition index
            int pivotIndex = partition(prices, low, high);

            // Sorting left part
            quickSort(prices, low, pivotIndex - 1);

            // Sorting right part
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    // Method to partition the array
    static int partition(int[] prices, int low, int high) 
    {

    	// Pivot element
        int pivot = prices[high];   
        int i = low - 1;

        for (int j = low; j < high; j++) 
        {
            if (prices[j] < pivot) 
            {
                i++;

                // Swap prices[i] and prices[j]
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        // Placing pivot at correct position
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }

  public static void main(String[] args) {

        // Array of product prices
        int[] prices = {1200, 450, 999, 300, 750};

        // Applying Quick Sort
        quickSort(prices, 0, prices.length - 1);

        // Printing sorted prices
        System.out.println("Product prices in ascending order:");
        for (int price : prices) 
        {
            System.out.print(price + " ");
        }
    }
}
