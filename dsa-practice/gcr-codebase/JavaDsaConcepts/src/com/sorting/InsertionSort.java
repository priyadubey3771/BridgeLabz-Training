package com.sorting;

public class InsertionSort {
	  public static void main(String[] args) {

	        // Array of employee IDs
	        int[] empIds = {105, 102, 110, 101, 108};

	        for (int i = 1; i < empIds.length; i++) 
	        {

	        	// Element to be inserted
	            int key = empIds[i];   
	            int j = i - 1;

	            // Move elements greater than key one position ahead
	            while (j >= 0 && empIds[j] > key)
	            {
	                empIds[j + 1] = empIds[j];
	                j--;
	            }

	            // Insert key at correct position
	            empIds[j + 1] = key;
	        }

	        // Printing sorted employee IDs
	        System.out.println("Employee IDs in ascending order:");
	        for (int id : empIds) 
	        {
	            System.out.print(id + " ");
	        }
	    }
	}
