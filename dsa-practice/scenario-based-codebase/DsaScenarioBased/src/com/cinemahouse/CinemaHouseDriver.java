package com.cinemahouse;

public class CinemaHouseDriver {
  public static void main(String[] args) {

        MovieShow[] dailyShows = {new MovieShow("Avatar", 1800), new MovieShow("Inception", 1400),new MovieShow("Interstellar", 2100),new MovieShow("Titanic", 1600),new MovieShow("Joker", 1200)};

        System.out.println("Before Sorting:");
        for (MovieShow show : dailyShows) 
        {
            show.display();
        }

        CinemaManager.bubbleSort(dailyShows);
        System.out.println("\nAfter Sorting by Show Time:");
        
        for (MovieShow show : dailyShows) 
        {
            show.display();
        }
    }
}
