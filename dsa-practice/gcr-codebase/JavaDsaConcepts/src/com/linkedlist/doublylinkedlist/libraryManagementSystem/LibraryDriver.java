package com.linkedlist.doublylinkedlist.libraryManagementSystem;

public class LibraryDriver {
  public static void main(String[] args) {

     LibraryLinkedList library = new LibraryLinkedList();

     // Add books
     library.addAtBeginning(101, "Java Basics", "James Gosling", "Programming", true);
     library.addAtEnd(102, "Data Structures", "Mark Allen", "Computer Science", true);
     library.addAtEnd(103, "Operating Systems", "Abraham Silberschatz", "CS", false);
     // Add book at specific position
     library.addAtPosition(2, 104, "Clean Code", "Robert Martin", "Software", true);
     // Display books
     library.displayForward();
     library.displayReverse();
     // Search operations
     library.searchByTitle("Clean Code");
     library.searchByAuthor("James Gosling");
     // Update availability
     library.updateAvailability(103, true);
     // Remove a book
     library.removeByBookId(102);
     // Final display
     library.displayForward();

     // Count total books
     System.out.println("\nTotal Books in Library: " + library.countBooks());
 }
}
