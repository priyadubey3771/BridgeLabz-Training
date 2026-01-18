package com.fleetmanager;

public class FleetManagerDriver {
   public static void main(String[] args) {

        // combined lists from different depots
        Vehicle[] masterSchedule = { new Vehicle("DL-101", 12000), new Vehicle("MH-202", 8000),new Vehicle("KA-303", 15000),new Vehicle("TN-404", 10000),new Vehicle("GJ-505", 6000)};

        System.out.println("Before Merging & Sorting:");
        for (Vehicle v : masterSchedule) 
        {
            v.display();
        }

        FleetSorter.mergeSort(masterSchedule, 0, masterSchedule.length - 1);

        System.out.println("\nMaster Maintenance Schedule (Sorted by Mileage):");
        for (Vehicle v : masterSchedule) 
        {
            v.display();
        }
    }
}
