package com.stackandqueue.circularTourProblem;

public class Driver {
  public static void main(String[] args) {

        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        CircularTour circularTour = new CircularTour();
        int start = circularTour.findStartingPump(petrol, distance);

        if (start != -1) 
        {
            System.out.println("Truck can start at pump index: " + start);
        } 
        else 
        {
            System.out.println("No circular tour possible");
        }
    }
}
