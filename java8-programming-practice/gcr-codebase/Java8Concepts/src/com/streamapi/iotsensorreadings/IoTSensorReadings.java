package com.streamapi.iotsensorreadings;

import java.util.*;
import java.util.stream.*;

public class IoTSensorReadings {
  public static void main(String[] args) {

	   List<Double> readings = Arrays.asList(18.5,42.3,35.0,50.7,27.8,60.2);

	   double threshold = 40.0;

	   System.out.println("Sensor Readings Above Threshold:");

	        readings.stream().filter(value -> value > threshold).forEach(value ->System.out.println("Reading: " + value));
	    }
	}


