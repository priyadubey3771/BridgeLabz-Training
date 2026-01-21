package com.gamerzone;

class QuickSort {

 // method to start Quick Sort
 static void sort(Player[] players, int low, int high) {

     if (low < high) 
     {
    	 int pivotIndex = partition(players, low, high);
         sort(players, low, pivotIndex - 1);
         sort(players, pivotIndex + 1, high);
     }
 }

 // Partition method
 static int partition(Player[] players, int low, int high) {

     int pivot = players[high].score;

     int i = low - 1;

     // traverse through array
     for (int j = low; j < high; j++) 
     {

         // place higher scores before pivot
         if (players[j].score >= pivot) 
         {
             i++;

             // swap players[i] and players[j]
             Player temp = players[i];
             players[i] = players[j];
             players[j] = temp;
         }
     }

     // place pivot in correct position
     Player temp = players[i + 1];
     players[i + 1] = players[high];
     players[high] = temp;

     return i + 1;
     
 }
}
