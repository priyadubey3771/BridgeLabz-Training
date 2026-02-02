package com.travellog;

import java.util.*;
import java.util.regex.*;

public class TravelAnalyzer {

    public static void analyze(List<Trip> trips) {

        Set<String> uniqueCountries = new HashSet<>();
        Map<String, Integer> cityCount = new HashMap<>();

        System.out.println("Trips longer than 5 days:");
        for (Trip t : trips) {

            // Duration > 5
            if (t.getDurationDays() > 5)
            {
                System.out.println(t);
            }

            // Unique countries
            uniqueCountries.add(t.getCountry());

            // City visit count
            cityCount.put(t.getCity(), cityCount.getOrDefault(t.getCity(), 0) + 1);

            // Regex search for city in notes
            Pattern p = Pattern.compile(t.getCity(), Pattern.CASE_INSENSITIVE);
            if (p.matcher(t.getNotes()).find()) 
            {
                System.out.println("City mentioned in notes: " + t.getCity());
            }
        }

        System.out.println("\nUnique Countries: " + uniqueCountries);

        // Top 3 cities
        List<Map.Entry<String, Integer>> list = new ArrayList<>(cityCount.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("\nTop 3 Most Visited Cities:");
        for (int i = 0; i < Math.min(3, list.size()); i++) 
        {
            System.out.println(list.get(i).getKey() + " -> " + list.get(i).getValue() + " times");
        }
    }
}
