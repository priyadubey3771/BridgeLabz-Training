package com.cropmonitor;

// represents a single sensor reading
class SensorData {

    long timestamp;      
    double temperature; 

    // constructor
    public SensorData(long timestamp, double temperature) 
    {
        this.timestamp = timestamp;
        this.temperature = temperature;
    }

    // display sensor reading
    public void display() 
    {
        System.out.println("Time: " + timestamp + " | Temp: " + temperature);
    }
}
