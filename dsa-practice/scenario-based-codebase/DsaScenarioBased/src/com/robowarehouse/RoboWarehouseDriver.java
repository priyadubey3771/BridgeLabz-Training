package com.robowarehouse;

public class RoboWarehouseDriver {
  public static void main(String[] args) {

        PackageItem[] shelf = {new PackageItem(101, 25),new PackageItem(102, 10),new PackageItem(103, 40),new PackageItem(104, 30),new PackageItem(105, 20)};

        System.out.println("Before Loading:");
        for (PackageItem p : shelf) 
        {
            p.display();
        }

        ShelfManager.insertionSort(shelf);

        System.out.println("\nAfter Shelf Balancing (Ascending Weight):");
        for (PackageItem p : shelf) 
        {
            p.display();
        }
    }
}
