package com.linkedlist.doublylinkedlist.movieManagementSystem;

public class MovieDriver {
  public static void main(String[] args) {

     MovieLinkedList movieList = new MovieLinkedList();

     // Adding movies
     movieList.addAtBeginning("Inception", "Christopher Nolan", 2010, 8.8);
     movieList.addAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);
     movieList.addAtEnd("Avatar", "James Cameron", 2009, 7.9);

     // Add at specific position
     movieList.addAtPosition(2, "Titanic", "James Cameron", 1997, 7.8);

     // Displaying movies
     movieList.displayForward();
     movieList.displayReverse();
      // Search operations
     movieList.searchByDirector("James Cameron");
     movieList.searchByRating(8.0);

      // Update rating
     movieList.updateRating("Avatar", 8.1);

     // Remove a movie
     movieList.removeByTitle("Titanic");

     // Final list
     movieList.displayForward();
 }
}
