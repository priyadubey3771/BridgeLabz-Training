package com.linkedlist.doublylinkedlist.movieManagementSystem;

public class MovieLinkedList {

 // Head and tail pointers
 private MovieNode head;
 private MovieNode tail;

 // Constructor
 public MovieLinkedList() 
 {
     head = null;
     tail = null;
 }

 // Add movie at the beginning
 public void addAtBeginning(String title, String director, int year, double rating)
 {
     MovieNode newNode = new MovieNode(title, director, year, rating);

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

 // Add movie at the end
 public void addAtEnd(String title, String director, int year, double rating) 
 {
     MovieNode newNode = new MovieNode(title, director, year, rating);

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

 // Add movie at a specific position
 public void addAtPosition(int position, String title, String director, int year, double rating) 
 {

     if (position <= 1) 
     {
         addAtBeginning(title, director, year, rating);
         return;
     }

     MovieNode current = head;
     int count = 1;

     while (current != null && count < position - 1) 
     {
         current = current.next;
         count++;
     }

     if (current == null || current.next == null) 
     {
         addAtEnd(title, director, year, rating);
     } 
     else 
     {
         MovieNode newNode = new MovieNode(title, director, year, rating);
         newNode.next = current.next;
         newNode.prev = current;
         current.next.prev = newNode;
         current.next = newNode;
     }
 }

 // Remove movie by title
 public void removeByTitle(String title) 
 {

     if (head == null) 
     {
         System.out.println("Movie list is empty");
         return;
     }

     MovieNode current = head;

     while (current != null) 
     {
         if (current.title.equalsIgnoreCase(title)) 
         {

             // Deleting head node
             if (current == head) 
             {
                 head = head.next;
                 if (head != null) 
                 {
                     head.prev = null;
                 }
             }
             // Deleting tail node
             else if (current == tail) 
             {
                 tail = tail.prev;
                 tail.next = null;
             }
             // Deleting middle node
             else 
             {
                 current.prev.next = current.next;
                 current.next.prev = current.prev;
             }

             System.out.println("Movie removed: " + title);
             return;
         }
         current = current.next;
     }

     System.out.println("Movie not found: " + title);
 }

 // Search movies by director
 public void searchByDirector(String director) 
 {
     MovieNode current = head;
     boolean found = false;

     while (current != null) 
     {
         if (current.director.equalsIgnoreCase(director)) 
         {
             displayMovie(current);
             found = true;
         }
         current = current.next;
     }

     if (!found) 
     {
         System.out.println("No movies found for director: " + director);
     }
 }

 // Search movies by rating (greater than or equal)
 public void searchByRating(double rating)
 {
     MovieNode current = head;
     boolean found = false;

     while (current != null) 
     {
         if (current.rating >= rating) 
         {
             displayMovie(current);
             found = true;
         }
         current = current.next;
     }

     if (!found) 
     {
         System.out.println("No movies found with rating >= " + rating);
     }
 }

 // Update movie rating using title
 public void updateRating(String title, double newRating) 
 {
     MovieNode current = head;

     while (current != null) 
     {
         if (current.title.equalsIgnoreCase(title)) 
         {
             current.rating = newRating;
             System.out.println("Rating updated for movie: " + title);
             return;
         }
         current = current.next;
     }

     System.out.println("Movie not found: " + title);
 }

 // Display movies in forward direction
 public void displayForward()
 {
     MovieNode current = head;
     System.out.println("\nMovies (Forward Order):");

     while (current != null) 
     {
         displayMovie(current);
         current = current.next;
     }
 }

 // Display movies in reverse direction
 public void displayReverse() {
     MovieNode current = tail;
     System.out.println("\nMovies (Reverse Order):");

     while (current != null) 
     {
         displayMovie(current);
         current = current.prev;
     }
 }

 // Helper method to display a single movie
 private void displayMovie(MovieNode node) {
     System.out.println( "Title: " + node.title +  ", Director: " + node.director +  ", Year: " + node.year + ", Rating: " + node.rating);
 }
}
