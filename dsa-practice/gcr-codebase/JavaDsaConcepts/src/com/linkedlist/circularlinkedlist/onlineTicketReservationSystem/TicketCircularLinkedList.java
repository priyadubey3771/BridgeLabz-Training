package com.linkedlist.circularlinkedlist.onlineTicketReservationSystem;

public class TicketCircularLinkedList {

 private TicketNode head;
 private TicketNode tail;

 // Constructor
 public TicketCircularLinkedList() 
 {
     head = null;
     tail = null;
 }

 // Add a new ticket at the end
 public void addTicket(int id, String customer, String movie,String seat, String time) 
 {

     TicketNode newTicket = new TicketNode(id, customer, movie, seat, time);

     // If list is empty
     if (head == null) 
     {
         head = tail = newTicket;
         newTicket.next = head; // circular link
     } 
     else 
     {
         tail.next = newTicket;
         newTicket.next = head;
         tail = newTicket;
     }

     System.out.println("Ticket booked successfully (ID: " + id + ")");
 }

 // Remove ticket by Ticket ID
 public void removeTicket(int ticketId)
 {

     if (head == null) 
     {
         System.out.println("No tickets to remove");
         return;
     }

     TicketNode current = head;
     TicketNode prev = tail;

     do 
     {
         if (current.ticketId == ticketId)
         {

             // If only one ticket exists
             if (current == head && current == tail) 
             {
                 head = tail = null;
             }
             // If removing head
             else if(current == head)
             {
                 head = head.next;
                 tail.next = head;
             }
             // If removing tail
             else if(current == tail)
             {
                 tail = prev;
                 tail.next = head;
             }
             // Removing middle ticket
             else 
             {
                 prev.next = current.next;
             }

             System.out.println("Ticket removed (ID: " + ticketId + ")");
             return;
         }

         prev = current;
         current = current.next;

     } 
     while (current != head);

     System.out.println("Ticket not found");
 }

 // Display all booked tickets
 public void displayTickets()
 {

     if (head == null)
     {
         System.out.println("No tickets booked");
         return;
     }

     TicketNode temp = head;

     System.out.println("\n Booked Tickets");
     do 
     {
         System.out.println( "Ticket ID: " + temp.ticketId +  ", Customer: " + temp.customerName +  ", Movie: " + temp.movieName +  ", Seat: " + temp.seatNumber +  ", Time: " + temp.bookingTime  );
         temp = temp.next;
     }
     while (temp != head);
 }

 // Search ticket by Customer Name or Movie Name
 public void searchTicket(String keyword) 
 {

     if (head == null) 
     {
         System.out.println("No tickets available");
         return;
     }

     TicketNode temp = head;
     boolean found = false;

     do 
     {
         if (temp.customerName.equalsIgnoreCase(keyword) || temp.movieName.equalsIgnoreCase(keyword)) 
         {

             System.out.println(   "Ticket ID: " + temp.ticketId +   ", Customer: " + temp.customerName +   ", Movie: " + temp.movieName +   ", Seat: " + temp.seatNumber +   ", Time: " + temp.bookingTime   );
             found = true;
         }
         
         temp = temp.next;
     } 
     while (temp != head);

     if(!found)
     {
         System.out.println("No matching ticket found");
     }
 }

 // Count total booked tickets
 public int countTickets()
 {

     if (head == null)
         return 0;

     int count = 0;
     TicketNode temp = head;

     do
     {
         count++;
         temp = temp.next;
     } 
     while (temp != head);

     return count;
 }
}
