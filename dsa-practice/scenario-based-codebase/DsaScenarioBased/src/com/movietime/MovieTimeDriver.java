package com.movietime;

public class MovieTimeDriver {
   public static void main(String[] args) {

        Show[] shows = {new Show("Avatar", 1030),new Show("Inception", 1200),new Show("Interstellar", 1400), new Show("Joker", 1130)};

        System.out.println("Before Sorting:");
        for (Show s : shows) 
        {
            s.display();
        }

        InsertionSort.sort(shows);

        System.out.println("\nSorted Show Listings:");
        for (Show s : shows)
        {
            s.display();
        }
        
    }
}
