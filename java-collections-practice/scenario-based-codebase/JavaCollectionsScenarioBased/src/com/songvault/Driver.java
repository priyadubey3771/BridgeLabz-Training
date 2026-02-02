package com.songvault;

import java.util.*;

public class Driver {
  public static void main(String[] args) throws Exception {

        List<Song> songs = SongVault.loadSongs("songs");

        System.out.println("=== All Songs ===");
        songs.forEach(System.out::println);

        System.out.println("\n=== Grouped By Genre ===");
        Map<String, List<Song>> byGenre =
                SongVault.groupByGenre(songs);
        byGenre.forEach((g, s) -> { System.out.println(g + " -> " + s); });

        System.out.println("\n=== Unique Artists ===");
        System.out.println(SongVault.uniqueArtists(songs));
    }
}
