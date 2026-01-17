package com.robowarehouse;

// represents a package placed on shelf
class PackageItem {

    int packageId;
    int weight;

    // Constructor
    public PackageItem(int packageId, int weight) 
    {
        this.packageId = packageId;
        this.weight = weight;
    }

    // display package
    public void display() 
    {
        System.out.println("Package " + packageId + " | Weight: " + weight);
    }
}
