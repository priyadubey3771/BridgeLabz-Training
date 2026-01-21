package com.foodfest;

public class FoodFestDriver {
  public static void main(String[] args) {

     // array of stalls with daily footfall data
     Stall[] stalls = { new Stall("Burger Hub", 320),new Stall("Taco Town", 450), new Stall("Pizza Palace", 450),new Stall("Sweet Treats", 280),new Stall("Spice Corner", 390)};

     // displaying stalls before sorting
     System.out.println("Before Sorting:");
     for (Stall s : stalls) 
     {
         s.display();
     }

     // applying merge sort on stall array
     MergeSort.sort(stalls, 0, stalls.length - 1);

     // display stalls after sorting
     System.out.println("\nMaster Footfall Ranking:");
     for (Stall s : stalls) 
     {
         s.display();
     }
     
   }
}
