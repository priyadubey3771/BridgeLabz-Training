package com.linkedlist.circularlinkedlist.onlineTicketReservationSystem;

public class TicketNode {

 int ticketId;
 String customerName;
 String movieName;
 String seatNumber;
 String bookingTime;

 // Pointer to next ticket (circular)
 TicketNode next;

 // Constructor
 public TicketNode(int ticketId, String customerName,  String movieName, String seatNumber,  String bookingTime)
 {
     this.ticketId = ticketId;
     this.customerName = customerName;
     this.movieName = movieName;
     this.seatNumber = seatNumber;
     this.bookingTime = bookingTime;
     this.next = null;
 }
}
