package com.medwarehouse;

class MergeSort {

 // recursive method to divide the array
 static void sort(Medicine[] medicines, int left, int right) {

     // stop recursion when single element remains
     if (left < right) {

         // find middle index
         int mid = (left + right) / 2;

         // sort left half
         sort(medicines, left, mid);

         // sort right half
         sort(medicines, mid + 1, right);

         // merge sorted halves
         merge(medicines, left, mid, right);
     }
 }

 // merge two sorted sub-arrays
 static void merge(Medicine[] medicines, int left, int mid, int right) {

     // Sizes of two sub arrays
     int n1 = mid - left + 1;
     int n2 = right - mid;

     // temporary arrays
     Medicine[] leftArr = new Medicine[n1];
     Medicine[] rightArr = new Medicine[n2];

     // copy data into left sub-array
     for (int i = 0; i < n1; i++) 
     {
         leftArr[i] = medicines[left + i];
     }

     // copy data into right sub-array
     for (int j = 0; j < n2; j++) {
         rightArr[j] = medicines[mid + 1 + j];
     }

     int i = 0, j = 0, k = left;

     // merge arrays by expiry date 
     while (i < n1 && j < n2) 
     {
    	 if (leftArr[i].expiryDate <= rightArr[j].expiryDate) 
         {
             medicines[k] = leftArr[i];
             i++;
         } 
         else
         {
             medicines[k] = rightArr[j];
             j++;
         }
         k++;
     }

     // copy remaining elements from left array
     while (i < n1) 
     {
         medicines[k] = leftArr[i];
         i++;
         k++;
     }

     // copy remaining elements from right array
     while (j < n2) 
     {
         medicines[k] = rightArr[j];
         j++;
         k++;
     }
     
   }
}
