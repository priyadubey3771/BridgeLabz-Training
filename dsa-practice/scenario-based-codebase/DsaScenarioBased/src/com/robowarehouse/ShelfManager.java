package com.robowarehouse;

// Manages shelf loading using Insertion Sort
public class ShelfManager {

    // Insertion Sort by weight (ascending)
    public static void insertionSort(PackageItem[] packages) {

        for (int i = 1; i < packages.length; i++) {

            PackageItem key = packages[i];
            int j = i - 1;

            // Shift heavier packages to the right
            while (j >= 0 && packages[j].weight > key.weight) {
                packages[j + 1] = packages[j];
                j--;
            }

            // Insert current package at correct position
            packages[j + 1] = key;
        }
    }
}
