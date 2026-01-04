package com.linkedlist.circularlinkedlist.onlineTicketReservationSystem;

public class TicketReservationDriver {
  public static void main(String[] args) {

     TicketCircularLinkedList tickets = new TicketCircularLinkedList();

     // Book tickets
     tickets.addTicket(101, "Amit", "Inception", "A1", "10:30 AM");
     tickets.addTicket(102, "Neha", "Inception", "A2", "10:32 AM");
     tickets.addTicket(103, "Rahul", "Avatar", "B5", "11:00 AM");

     // Display tickets
     tickets.displayTickets();
     // Search tickets
     tickets.searchTicket("Inception");
     tickets.searchTicket("Rahul");
     // Remove a ticket
     tickets.removeTicket(102);
     // Display again
     tickets.displayTickets();
     // Count tickets
     
     System.out.println("Total Booked Tickets: " + tickets.countTickets() );
 }
}
