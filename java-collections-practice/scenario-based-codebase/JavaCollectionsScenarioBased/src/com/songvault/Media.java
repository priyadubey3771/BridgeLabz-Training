package com.songvault;

public class Media {
    protected String title;
    protected String artist;
    protected String duration;
    protected String genre;

    public Media(String title, String artist, String duration, String genre) 
    {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
    }

    public String getTitle() 
    { 
    	return title; 
    }
    public String getArtist() 
    { 
    	return artist;
    }
    public String getDuration() 
    { 
    	return duration; 
    }
    public String getGenre() { return genre; }

    @Override
    public String toString() 
    {
        return title + " | " + artist + " | " + duration + " | " + genre;
    }
}
