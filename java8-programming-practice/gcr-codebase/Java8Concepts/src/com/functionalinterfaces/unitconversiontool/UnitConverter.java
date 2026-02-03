package com.functionalinterfaces.unitconversiontool;

public interface UnitConverter {

    // 1 km = 0.621371 miles
    static double kmToMiles(double km) 
    {
        return km * 0.621371;
    }

    // 1 kg = 2.20462 pounds
    static double kgToPounds(double kg) 
    {
        return kg * 2.20462;
    }
}
