package com.foodfest;

class MergeSort {

 // recursive method to divide the array
 static void sort(Stall[] stalls, int left, int right) {

     if (left < right) {

         // find middle index
         int mid = (left + right) / 2;

         // recursively sort left half
         sort(stalls, left, mid);

         // recursively sort right half
         sort(stalls, mid + 1, right);

         // merge both sorted halves
         merge(stalls, left, mid, right);
     }
 }

 // method to merge two sorted halves
 static void merge(Stall[] stalls, int left, int mid, int right) 
 {

     // calculate sizes of sub-arrays
     int n1 = mid - left + 1;
     int n2 = right - mid;

     // temporary arrays to store data
     Stall[] leftArray = new Stall[n1];
     Stall[] rightArray = new Stall[n2];

     // copy data to temporary left array
     for (int i = 0; i < n1; i++)
     {
         leftArray[i] = stalls[left + i];
     }

     // copy data to temporary right array
     for (int j = 0; j < n2; j++) 
     {
         rightArray[j] = stalls[mid + 1 + j];
     }

     int i = 0, j = 0;
     int k = left;

     // merge arrays in descending order of footfall
     while (i < n1 && j < n2) 
     {
    	 // Compare footfall of stalls
         if (leftArray[i].footfall >= rightArray[j].footfall) 
         {
             stalls[k] = leftArray[i];
             i++;
             
         } 
         else 
         {
             stalls[k] = rightArray[j];
             j++;
         }
         k++;
     }

     // copy remaining elements from left array
     while (i < n1) 
     {
         stalls[k] = leftArray[i];
         i++;
         k++;
     }

     // copy remaining elements from right array
     while (j < n2) 
     {
         stalls[k] = rightArray[j];
         j++;
         k++;
     }
     
 }
}
