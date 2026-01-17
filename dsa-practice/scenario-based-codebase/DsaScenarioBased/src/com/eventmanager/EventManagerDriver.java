package com.eventmanager;

public class EventManagerDriver {
  public static void main(String[] args) {

        Ticket[] tickets = {new Ticket("Concert A", 1500), new Ticket("Concert B", 800), new Ticket("Concert C", 2200), new Ticket("Concert D", 500), new Ticket("Concert E", 1200)};

        System.out.println("Before Sorting:");
        for (Ticket t : tickets) 
        {
            t.display();
        }

        EventManagerSorter.quickSort(tickets, 0, tickets.length - 1);
        System.out.println("\nAfter Sorting by Price:");
        for (Ticket t : tickets) 
        {
            t.display();
        }

        System.out.println("\nTop 2 Cheapest Tickets:");
        tickets[0].display();
        tickets[1].display();
    }
}
