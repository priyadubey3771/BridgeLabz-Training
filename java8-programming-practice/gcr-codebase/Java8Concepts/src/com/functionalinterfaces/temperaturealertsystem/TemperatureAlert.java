package com.functionalinterfaces.temperaturealertsystem;

import java.util.function.Predicate;
public class TemperatureAlert {
   public static void main(String[] args) {

        double threshold = 35.0;

        // Predicate to check temperature condition
        Predicate<Double> isHighTemperature = temp -> temp > threshold;

        double currentTemp = 38.5;

        if (isHighTemperature.test(currentTemp)) 
        {
            System.out.println("⚠️ Alert! High temperature detected: " + currentTemp);
        } 
        else 
        {
            System.out.println("Temperature is normal: " + currentTemp);
        }
    }
}
