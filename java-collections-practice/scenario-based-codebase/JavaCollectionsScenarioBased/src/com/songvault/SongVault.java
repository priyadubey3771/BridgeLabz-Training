package com.songvault;

import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class SongVault {

    private static final String TITLE = "Title: (.*)";
    private static final String ARTIST = "Artist: (.*)";
    private static final String DURATION = "Duration: (.*)";
    private static final String GENRE = "Genre: (.*)";

    public static List<Song> loadSongs(String folderPath) throws IOException {

        List<Song> songs = new ArrayList<>();
        File folder = new File(folderPath);

        for (File file : folder.listFiles()) 
        {
        	BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            String title = "", artist = "", duration = "", genre = "";

            while ((line = br.readLine()) != null) 
            {

                if (line.matches(TITLE))
                {
                    title = line.replaceAll(TITLE, "$1");
                }

                else if (line.matches(ARTIST))
                {
                    artist = line.replaceAll(ARTIST, "$1");
                }

                else if (line.matches(DURATION))
                {
                    duration = line.replaceAll(DURATION, "$1");
                }

                else if (line.matches(GENRE))
                {
                    genre = line.replaceAll(GENRE, "$1");
                }
            }

            br.close();
            songs.add(new Song(title, artist, duration, genre));
        }

        return songs;
    }

    public static Map<String, List<Song>> groupByGenre(List<Song> songs) 
    {
        return songs.stream().collect(Collectors.groupingBy(Song::getGenre));
    }

    public static Set<String> uniqueArtists(List<Song> songs) 
    {
        return songs.stream().map(Song::getArtist).collect(Collectors.toSet());
    }
}
