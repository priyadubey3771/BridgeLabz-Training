package com.functionalinterfaces.unitconversiontool;

public class Driver {
  public static void main(String[] args) {

        double distanceKm = 10;
        double weightKg = 5;

        double miles = UnitConverter.kmToMiles(distanceKm);
        double pounds = UnitConverter.kgToPounds(weightKg);

        System.out.println(distanceKm + " km = " + miles + " miles");
        System.out.println(weightKg + " kg = " + pounds + " pounds");
    }
}
