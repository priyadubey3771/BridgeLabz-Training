package com.tailorshop;

class InsertionSort {
	
static void sort(Order[] orders) {

     // start from second element
     for (int i = 1; i < orders.length; i++) 
     {
    	 // current order to be placed correctly
         Order key = orders[i];
         int j = i - 1;

         // shift orders with later deadlines to the right
         while (j >= 0 && orders[j].deliveryDay > key.deliveryDay)
         {
             orders[j + 1] = orders[j];
             j--;
         }

         // insert the order at correct position
         orders[j + 1] = key;
     }
     
 }
}
