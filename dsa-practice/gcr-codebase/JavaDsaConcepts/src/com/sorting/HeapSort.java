package com.sorting;

public class HeapSort {

    // Method to apply Heap Sort
    static void heapSort(int[] salaries) 
    {
        int n = salaries.length;

        //Building Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) 
        {
            heapify(salaries, n, i);
        }

        //Extracting elements from heap
        for (int i = n - 1; i > 0; i--)
        {

            // Swapping root with last element
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            // Heapifying reduced heap
            heapify(salaries, i, 0);
        }
    }

    // Method to heapify a subtree
    static void heapify(int[] salaries, int n, int i) 
    {

        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Check left child
        if (left < n && salaries[left] > salaries[largest]) 
        {
            largest = left;
        }

        // Check right child
        if (right < n && salaries[right] > salaries[largest]) 
        {
            largest = right;
        }

        // Swap and continue heapifying if needed
        if (largest != i) 
        {
            int temp = salaries[i];
            salaries[i] = salaries[largest];
            salaries[largest] = temp;

            heapify(salaries, n, largest);
        }
    }

    public static void main(String[] args) {

        // Array of expected salary demands
        int[] salaries = {55000, 72000, 48000, 90000, 61000};

        // Apply Heap Sort
        heapSort(salaries);

        // Display sorted salary demands
        System.out.println("Salary demands in ascending order:");
        for (int salary : salaries)
        {
            System.out.print(salary + " ");
        }
    }
}
