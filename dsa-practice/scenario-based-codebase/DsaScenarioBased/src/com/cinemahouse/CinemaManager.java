package com.cinemahouse;

// manages movie schedule sorting
public class CinemaManager {

    // bubble Sort by show time - ascending
    public static void bubbleSort(MovieShow[] shows) 
    {
    	int n = shows.length;

        for (int i = 0; i < n - 1; i++) 
        {
        	// after every pass, the latest show goes to the end
            for (int j = 0; j < n - i - 1; j++) 
            {
            	if (shows[j].showTime > shows[j + 1].showTime) 
                {
                	// swap adjacent shows
                    MovieShow temp = shows[j];
                    shows[j] = shows[j + 1];
                    shows[j + 1] = temp;
                }
            }
        }
    }
}
