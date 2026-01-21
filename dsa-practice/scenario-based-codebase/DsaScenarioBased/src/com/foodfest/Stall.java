package com.foodfest;

class Stall {
	
    String stallName;
    // Number of customers visiting the stall
    int footfall;

    //constructor
    Stall(String stallName, int footfall) 
    {
        this.stallName = stallName;
        this.footfall = footfall;
    }

    void display() 
    {
        System.out.println(stallName + " - " + footfall + " visitors");
    }
}
