package com.stackandqueue.circularTourProblem;

public class CircularTour {

    public int findStartingPump(int[] petrol, int[] distance) 
    {
        int n = petrol.length;

        // total petrol - distance
        int totalSurplus = 0; 
       // petrol for current trial
        int currentSurplus = 0; 
        int start = 0;

        for (int i = 0; i < n; i++) 
        {
            int netPetrol = petrol[i] - distance[i];
            totalSurplus += netPetrol;
            currentSurplus += netPetrol;

            if (currentSurplus < 0) 
            {
                start = i + 1;
                currentSurplus = 0;
            }
        }

        if (totalSurplus >= 0) 
        {
            return start;
        } 
        else 
        {
        	// tour not possible
            return -1; 
        }
    }
}
