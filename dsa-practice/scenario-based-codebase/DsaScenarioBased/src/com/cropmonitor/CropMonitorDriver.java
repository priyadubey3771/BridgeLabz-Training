package com.cropmonitor;

public class CropMonitorDriver {

    public static void main(String[] args) {

        SensorData[] readings = { new SensorData(1683000500L, 29.5),new SensorData(1683000100L, 28.2),new SensorData(1683000900L, 30.1),new SensorData(1683000300L, 27.8),new SensorData(1683000700L, 29.0)};

        System.out.println("Before Sorting:");
        for (SensorData s : readings) 
        {
            s.display();
        }

        CropMonitorSorter.quickSort(readings, 0, readings.length - 1);

        System.out.println("\nAfter Sorting by Timestamp:");
        for (SensorData s : readings) 
        {
            s.display();
        }
    }
}
