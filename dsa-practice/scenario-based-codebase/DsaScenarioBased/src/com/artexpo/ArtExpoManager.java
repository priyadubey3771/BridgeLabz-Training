package com.artexpo;

// manages artist registration list
public class ArtExpoManager {
// insertion Sort by registration time
   public static void insertionSort(Artist[] artists) {

        for (int i = 1; i < artists.length; i++) 
        {
        	Artist current = artists[i];
            int j = i - 1;

            // shift artists registered later to the right
            while (j >= 0 && artists[j].registrationTime > current.registrationTime)
            {
                artists[j + 1] = artists[j];
                j--;
            }

            // insert artist at correct position
            artists[j + 1] = current;
        }
    }
}
