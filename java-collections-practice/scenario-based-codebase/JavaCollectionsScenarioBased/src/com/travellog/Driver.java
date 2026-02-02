package com.travellog;

import java.util.*;

public class Driver {
  public static void main(String[] args) throws Exception {

        List<Trip> trips = new ArrayList<>();

        trips.add(new Trip("Paris", "France", 7,"Visited Eiffel Tower in Paris"));
        trips.add(new Trip("Rome", "Italy", 4,"Colosseum visit in Rome"));
        trips.add(new Trip("Paris", "France", 6,"Food tour in Paris"));
        trips.add(new Trip("Tokyo", "Japan", 8,"Cherry blossoms in Tokyo"));
        trips.add(new Trip("Delhi", "India", 3,"Street food in Delhi"));

        // Save to file
        TravelWriter.saveTrips(trips, "trips.dat");

        // Load from file
        List<Trip> loadedTrips = TravelReader.loadTrips("trips.dat");

        // Analyze
        TravelAnalyzer.analyze(loadedTrips);
    }
}
