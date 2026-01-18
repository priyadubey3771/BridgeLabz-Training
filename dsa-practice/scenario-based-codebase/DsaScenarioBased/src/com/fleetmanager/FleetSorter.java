package com.fleetmanager;

// handles merging and sorting of vehicle schedules
public class FleetSorter {

    // merge Sort entry method
    public static void mergeSort(Vehicle[] vehicles, int left, int right) 
    {
    	if (left < right) 
        {
        	int mid = (left + right) / 2;

            // sort left and right halves
            mergeSort(vehicles, left, mid);
            mergeSort(vehicles, mid + 1, right);

            // merge sorted halves
            merge(vehicles, left, mid, right);
        }
    }

    // merge two sorted halves
    private static void merge(Vehicle[] vehicles, int left, int mid, int right)
    {
    	int n1 = mid - left + 1;
        int n2 = right - mid;

        Vehicle[] leftArr = new Vehicle[n1];
        Vehicle[] rightArr = new Vehicle[n2];

        // copy data into temp arrays
        for (int i = 0; i < n1; i++)
        {
            leftArr[i] = vehicles[left + i];
        }

        for (int j = 0; j < n2; j++)
        {
            rightArr[j] = vehicles[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        // merge based on mileage
        while (i < n1 && j < n2) 
        {

            if (leftArr[i].mileage <= rightArr[j].mileage) 
            {
                vehicles[k] = leftArr[i];
                i++;
            }
            else 
            {
                vehicles[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // copy remaining elements
        while (i < n1) 
        {
            vehicles[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) 
        {
            vehicles[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
