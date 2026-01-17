package com.zipzipmart;

// handles merge sort for sales records
public class ZipZipMartSorter {

    // Merge Sort entry method
    public static void mergeSort(SalesRecord[] records, int left, int right) 
    {

        if (left < right) 
        {
        	int mid = (left + right) / 2;
            mergeSort(records, left, mid);
            mergeSort(records, mid + 1, right);
            merge(records, left, mid, right);
            
        }
    }

    // merge two sorted halves
    private static void merge(SalesRecord[] records, int left, int mid, int right) 
    {
    	int n1 = mid - left + 1;
        int n2 = right - mid;

        SalesRecord[] L = new SalesRecord[n1];
        SalesRecord[] R = new SalesRecord[n2];

        // copy data into temp arrays
        for (int i = 0; i < n1; i++)
        {
            L[i] = records[left + i];
        }

        for (int j = 0; j < n2; j++)
        {
            R[j] = records[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) 
        {

            if (L[i].date.compareTo(R[j].date) < 0 || (L[i].date.equals(R[j].date) && L[i].amount <= R[j].amount)) 
            {

                records[k] = L[i];
                i++;
            } 
            else 
            {
                records[k] = R[j];
                j++;
            }
            k++;
        }
        // copying remaining elements
        while (i < n1) 
        {
            records[k++] = L[i++];
        }

        while (j < n2) 
        {
            records[k++] = R[j++];
        }
    }
}
