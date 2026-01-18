package com.cropmonitor;

// sorts sensor data using quick Sort
public class CropMonitorSorter {

    // Quick Sort entry method
    public static void quickSort(SensorData[] data, int low, int high) 
    {
    	
    	if (low < high) 
        {
        	// partition the array
            int pivotIndex = partition(data, low, high);

            // recursively sort left and right parts
            quickSort(data, low, pivotIndex - 1);
            quickSort(data, pivotIndex + 1, high);
        }
    }

    // partition logic based on timestamp
    private static int partition(SensorData[] data, int low, int high) 
    {
    	SensorData pivot = data[high]; 
        int i = low - 1;

        for (int j = low; j < high; j++) 
        {
        	// place earlier timestamps to the left
            if (data[j].timestamp < pivot.timestamp) 
            {
                i++;

                //sSwap data[i] and data[j]
                SensorData temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }

        // place pivot in correct position
        SensorData temp = data[i + 1];
        data[i + 1] = data[high];
        data[high] = temp;

        return i + 1;
    }
}
