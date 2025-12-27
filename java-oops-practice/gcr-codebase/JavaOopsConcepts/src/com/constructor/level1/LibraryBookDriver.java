package com.constructor.level1;

public class LibraryBookDriver {
  public static void main(String[] args) {
        
    	// Creating a LibraryBook object using parameterized constructor
        LibraryBook book = new LibraryBook("Clean Code", "Robert C. Martin", 450.00, true);
        
        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Available: " + book.isAvailable());
        
        // Borrowing the book
        book.borrowBook();
        
        // Displaying availability after borrowing
        System.out.println("Available after borrowing: " + book.isAvailable());
     }
  }
