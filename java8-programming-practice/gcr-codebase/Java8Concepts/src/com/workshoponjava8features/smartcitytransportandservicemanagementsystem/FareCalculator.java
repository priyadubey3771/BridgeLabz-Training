package com.workshoponjava8features.smartcitytransportandservicemanagementsystem;

@FunctionalInterface
interface FareCalculator {
	
    double calculateFare(double distance, double ratePerKm);
}
