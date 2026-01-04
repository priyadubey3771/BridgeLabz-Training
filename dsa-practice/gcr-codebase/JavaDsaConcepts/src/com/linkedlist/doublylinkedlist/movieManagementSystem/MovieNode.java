package com.linkedlist.doublylinkedlist.movieManagementSystem;

public class MovieNode {

 // Movie details
 String title;
 String director;
 int year;
 double rating;

 // Pointers for doubly linked list
 MovieNode next;
 MovieNode prev;

 // Constructor to initialize movie details
 public MovieNode(String title, String director, int year, double rating) 
 {
     this.title = title;
     this.director = director;
     this.year = year;
     this.rating = rating;
     this.next = null;
     this.prev = null;
 }
}
