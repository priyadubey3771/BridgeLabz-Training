package com.ambulanceroute;

public class AmbulanceRouteDriver {
  public static void main(String[] args) {

     AmbulanceRoute route = new AmbulanceRoute();

     // adding hospital units
     route.addUnit("Emergency", true);
     route.addUnit("Radiology", false);
     route.addUnit("Surgery", true);
     route.addUnit("ICU", false);

     // displaying route
     route.displayRoute();

     // redirecting patient
     route.redirectPatient();

     // removing a unit under maintenance
     route.removeUnit("Radiology");

     // displaying updated route
     route.displayRoute();

     // redirecting patient again
     route.redirectPatient();
 }
}
