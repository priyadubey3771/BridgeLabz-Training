package com.linkedlist.doublylinkedlist.libraryManagementSystem;

public class BookNode {

 String title;
 String author;
 String genre;
 int bookId;
 boolean isAvailable;

 // Pointers for doubly linked list
 BookNode next;
 BookNode prev;

 // Constructor to initialize book details
 public BookNode(int bookId, String title, String author, String genre, boolean isAvailable) 
 {
     this.bookId = bookId;
     this.title = title;
     this.author = author;
     this.genre = genre;
     this.isAvailable = isAvailable;
     this.next = null;
     this.prev = null;
 }
}
