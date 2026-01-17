package com.eventmanager;

// Represents an event ticket
class Ticket {

    String eventName;
    int price;

    // Constructor
    public Ticket(String eventName, int price) {
        this.eventName = eventName;
        this.price = price;
    }

    // Display ticket details
    public void display() {
        System.out.println(eventName + " | Price: " + price);
    }
}
