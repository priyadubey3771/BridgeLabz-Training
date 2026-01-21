package com.movietime;

class InsertionSort {

    static void sort(Show[] shows) 
    {
        int n = shows.length;

        for (int i = 1; i < n; i++) 
        {
            Show key = shows[i];
            int j = i - 1;

            // shift shows that start later than key
            while (j >= 0 && shows[j].time > key.time) 
            {
                shows[j + 1] = shows[j];
                j--;
            }

            shows[j + 1] = key;
        }
    }
}
