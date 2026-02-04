package com.workshoponjava8features.smartcitytransportandservicemanagementsystem;

import java.util.*;
import java.util.stream.*;

public class Driver {
  public static void main(String[] args) {

        // Lambda Fare Calculator
        FareCalculator calculator = (distance, rate) -> distance * rate;

        double distance = GeoUtils.calculateDistance(10, 20, 12, 25);
        System.out.println("Calculated Fare: " + calculator.calculateFare(distance, 5));

        // List of transport services
        List<TransportService> services = Arrays.asList(
                new BusService("A-B", 30, "08:00"),
                new MetroService("A-C", 50, "07:30"),
                new TaxiService("A-D", 150, "09:00"),
                new AmbulanceService());

        System.out.println("\n--- All Services (forEach + Method Reference) ---");
        services.forEach(TransportService::printServiceDetails);

        // Lambda filtering & sorting (cheapest first)
        System.out.println("\n--- Cheapest Services First ---");
        services.stream().sorted(Comparator.comparing(TransportService::getFare)).forEach(TransportService::printServiceDetails);

        // Passenger data for Stream API + Collectors
        List<Passenger> passengers = Arrays.asList(
                new Passenger("A", "A-B", 30, true),
                new Passenger("B", "A-B", 30, false),
                new Passenger("C", "A-C", 50, true),
                new Passenger("D", "A-D", 150, true),
                new Passenger("E", "A-C", 50, false));

        // groupingBy()
        System.out.println("\n--- Passengers Grouped By Route ---");
        Map<String, List<Passenger>> byRoute = passengers.stream().collect(Collectors.groupingBy(Passenger::getRoute));
        byRoute.forEach((k, v) -> System.out.println(k + " -> " + v.size()));

        // partitioningBy()
        System.out.println("\n--- Peak vs Non-Peak Trips ---");
        Map<Boolean, List<Passenger>> peakData =passengers.stream().collect(Collectors.partitioningBy(Passenger::isPeakTime));
        peakData.forEach((k, v) -> System.out.println(k ? "Peak: " : "Non-Peak: " + v.size()));

        // summarizingDouble()
        System.out.println("\n--- Fare Statistics ---");
        DoubleSummaryStatistics stats = passengers.stream().collect(Collectors.summarizingDouble(Passenger::getFare));
        System.out.println(stats);

        // Emergency check using marker interface
        System.out.println("\n--- Emergency Services ---");
        services.stream().filter(s -> s instanceof EmergencyService).forEach(TransportService::printServiceDetails);
    }
}
