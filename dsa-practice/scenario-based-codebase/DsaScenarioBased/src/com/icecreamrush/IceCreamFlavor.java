package com.icecreamrush;

// represents an ice cream flavor
class IceCreamFlavor {

    String flavorName;
    int soldCount;   

    // constructor
    public IceCreamFlavor(String flavorName, int soldCount) 
    {
        this.flavorName = flavorName;
        this.soldCount = soldCount;
    }

    // display flavor details
    public void display() 
    {
        System.out.println(flavorName + " | Sold: " + soldCount);
    }
}
