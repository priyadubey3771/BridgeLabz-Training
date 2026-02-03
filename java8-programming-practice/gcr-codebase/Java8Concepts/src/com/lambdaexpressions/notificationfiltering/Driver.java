package com.lambdaexpressions.notificationfiltering;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Driver {
    public static void main(String[] args) {
    	
        List<Alert> alerts = new ArrayList<>();
        alerts.add(new Alert("MEDICATION", "Time to take your blood pressure medicine."));
        alerts.add(new Alert("APPOINTMENT", "You have an appointment with Dr. Sharma tomorrow."));
        alerts.add(new Alert("EMERGENCY", "Heart rate abnormal! Contact doctor immediately."));
        alerts.add(new Alert("MEDICATION", "Time to take your insulin shot."));

        // User preference: only MEDICATION alerts
        Predicate<Alert> medicationFilter = alert -> alert.type.equals("MEDICATION");

        // User preference: EMERGENCY alerts
        Predicate<Alert> emergencyFilter = alert -> alert.type.equals("EMERGENCY");

        // Filtering alerts
        List<Alert> medicationAlerts = filterAlerts(alerts, medicationFilter);
        List<Alert> emergencyAlerts = filterAlerts(alerts, emergencyFilter);

        System.out.println("Medication Alerts:");
        medicationAlerts.forEach(System.out::println);

        System.out.println("\nEmergency Alerts:");
        emergencyAlerts.forEach(System.out::println);
    }

    // Method to filter alerts based on any Predicate
    public static List<Alert> filterAlerts(List<Alert> alerts, Predicate<Alert> condition) 
    {
        return alerts.stream().filter(condition).collect(Collectors.toList());
    }
}
