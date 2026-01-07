package com.runtimeanalysisandbigonotation.SearchTargetInLargeDataset;

public class LinearSearchProgram {
	
	static int linearSearch(int[] arr, int target) 
	{
	        for (int i = 0; i < arr.length; i++) 
	        {
	            if (arr[i] == target) 
	            {
	                return i;
	            }
	        }
	        return -1;
	}

  public static void main(String[] args){
	  
        int[] data = {5, 8, 12, 20, 35, 50};
        int target = 20;
        int result = linearSearch(data, target);
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



