package com.travellog;

import java.io.*;
import java.util.List;

public class TravelWriter {

    public static void saveTrips(List<Trip> trips, String fileName) throws IOException {

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
        oos.writeObject(trips);
        oos.close();
    }
}
