package com.workshoponjava8features.smartcitytransportandservicemanagementsystem;

interface GeoUtils {

    static double calculateDistance(double lat1, double lon1,double lat2, double lon2) 
    {
        // Dummy distance formula for demo
        return Math.sqrt(Math.pow(lat2 - lat1, 2) + Math.pow(lon2 - lon1, 2)) * 111;
    }
}
