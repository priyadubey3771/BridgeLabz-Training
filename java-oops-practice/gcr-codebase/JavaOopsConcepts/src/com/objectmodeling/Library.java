package com.objectmodeling;

import java.util.ArrayList;
public class Library {

 private String libraryName;

 // Aggregation- Library HAS-A list of Book objects
 private ArrayList<Book> books;

 // Constructor
 public Library(String libraryName) 
 {
     this.libraryName = libraryName;
     this.books = new ArrayList<>();
 }

 // Method to add a book to the library
 public void addBook(Book book) 
 {
     books.add(book);
 }

 // Method to display all books in the library
 public void displayLibraryBooks() 
 {
     System.out.println("\nLibrary Name: " + libraryName);

     if (books.isEmpty()) 
     {
         System.out.println("No books available");
     } 
     else 
     {
         for (Book book : books)
         {
             book.displayBookDetails();
             System.out.println(" ");
         }
     }
 }
}
