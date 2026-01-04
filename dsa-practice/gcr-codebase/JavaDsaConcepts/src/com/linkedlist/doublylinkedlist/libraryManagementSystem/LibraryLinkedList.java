package com.linkedlist.doublylinkedlist.libraryManagementSystem;

public class LibraryLinkedList {

 private BookNode head;
 private BookNode tail;

 // Constructor
 public LibraryLinkedList() 
 {
     head = null;
     tail = null;
 }

 // Add book at beginning
 public void addAtBeginning(int id, String title, String author, String genre, boolean available) 
 {
     BookNode newNode = new BookNode(id, title, author, genre, available);

     if (head == null) 
     {
         head = tail = newNode;
     } 
     else 
     {
         newNode.next = head;
         head.prev = newNode;
         head = newNode;
     }
 }

 // Add book at end
 public void addAtEnd(int id, String title, String author, String genre, boolean available) {
     BookNode newNode = new BookNode(id, title, author, genre, available);

     if (tail == null) 
     {
         head = tail = newNode;
     } 
     else 
     {
         tail.next = newNode;
         newNode.prev = tail;
         tail = newNode;
     }
 }

 // Add book at a specific position (1-based index)
 public void addAtPosition(int position, int id, String title, String author, String genre, boolean available) {

     if (position <= 1 || head == null) 
     {
         addAtBeginning(id, title, author, genre, available);
         return;
     }

     BookNode current = head;
     int count = 1;

     while (current.next != null && count < position - 1) 
     {
         current = current.next;
         count++;
     }

     if (current.next == null) 
     {
         addAtEnd(id, title, author, genre, available);
     } 
     else 
     {
         BookNode newNode = new BookNode(id, title, author, genre, available);
         newNode.next = current.next;
         newNode.prev = current;
         current.next.prev = newNode;
         current.next = newNode;
     }
 }

 // Remove book by Book ID
 public void removeByBookId(int id) {

     if (head == null) 
     {
         System.out.println("Library is empty");
         return;
     }

     BookNode current = head;

     while (current != null) 
     {
         if (current.bookId == id)
         {

             // If removing head
             if (current == head) 
             {
                 head = head.next;
                 if (head != null) 
                 {
                     head.prev = null;
                 }
             }
             // If removing tail
             else if(current == tail) 
             {
                 tail = tail.prev;
                 tail.next = null;
             }
             // Removing middle node
             else 
             {
                 current.prev.next = current.next;
                 current.next.prev = current.prev;
             }

             System.out.println("Book removed with ID: " + id);
             return;
         }
         current = current.next;
     }

     System.out.println("Book not found with ID: " + id);
 }

 // Search book by title
 public void searchByTitle(String title) {

     BookNode current = head;
     boolean found = false;

     while (current != null)
     {
         if (current.title.equalsIgnoreCase(title))
         {
             displayBook(current);
             found = true;
         }
         current = current.next;
     }

     if (!found) 
     {
         System.out.println("Book not found with title: " + title);
     }
 }

 // Search book by author
 public void searchByAuthor(String author) {

     BookNode current = head;
     boolean found = false;

     while (current != null) 
     {
         if (current.author.equalsIgnoreCase(author)) 
         {
             displayBook(current);
             found = true;
         }
         current = current.next;
     }

     if (!found) 
     {
         System.out.println("No books found by author: " + author);
     }
 }

 // Update availability status by Book ID
 public void updateAvailability(int id, boolean status) {

     BookNode current = head;

     while (current != null) 
     {
         if (current.bookId == id)
         {
             current.isAvailable = status;
             System.out.println("Availability updated for Book ID: " + id);
             return;
         }
         current = current.next;
     }

     System.out.println("Book not found with ID: " + id);
 }

 // Display all books in forward order
 public void displayForward() {

     BookNode current = head;
     System.out.println("\nLibrary Books (Forward Order):");

     while (current != null) 
     {
         displayBook(current);
         current = current.next;
     }
 }

 // Display all books in reverse order
 public void displayReverse() {

     BookNode current = tail;
     System.out.println("\nLibrary Books (Reverse Order):");

     while (current != null) 
     {
         displayBook(current);
         current = current.prev;
     }
 }

 // Count total books
 public int countBooks() 
 {

     int count = 0;
     BookNode current = head;

     while (current != null) 
     {
         count++;
         current = current.next;
     }

     return count;
 }

 // Helper method to display one book
 private void displayBook(BookNode book) {
     System.out.println( "ID: " + book.bookId + ", Title: " + book.title +", Author: " + book.author + ", Genre: " + book.genre + ", Available: " + (book.isAvailable ? "Yes" : "No"));
 }
}
