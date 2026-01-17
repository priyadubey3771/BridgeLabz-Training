package com.cinemahouse;

// represents a movie show
class MovieShow {

    String movieName;
    int showTime;   

    // constructor
    public MovieShow(String movieName, int showTime) 
    {
        this.movieName = movieName;
        this.showTime = showTime;
    }

    // display show details
    public void display() 
    {
        System.out.println(movieName + " at " + showTime);
    }
}
