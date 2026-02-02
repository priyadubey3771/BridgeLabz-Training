package com.travellog;

import java.io.*;
import java.util.List;

public class TravelReader {

    @SuppressWarnings("unchecked")
    public static List<Trip> loadTrips(String fileName)throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));

        List<Trip> trips = (List<Trip>) ois.readObject();
        ois.close();

        return trips;
    }
}
