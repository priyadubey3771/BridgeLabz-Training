package com.bookshelf;

import java.util.*;
class BookShelf {

 // HashMap stores genre as key and list of books as value
 private HashMap<String, LinkedList<Book>> catalog = new HashMap<>();

 // HashSet to prevent duplicate ISBN entry
 private HashSet<String> isbnSet = new HashSet<>();

 // Method to add book to the library
 public void addBook(String genre, Book book) 
 {

     // Checking if the book already exists
     if (isbnSet.contains(book.getIsbn())) 
     {
         System.out.println("Duplicate book not allowed.");
         return;
     }

     // Creating genre list if it does not exist
     catalog.putIfAbsent(genre, new LinkedList<>());

     // Add book to the genre list
     catalog.get(genre).add(book);

     // Store ISBN to avoid duplicates
     isbnSet.add(book.getIsbn());

     System.out.println("Book added to genre: " + genre);
 }

 // Method to borrow or remove a book
 public void borrowBook(String genre, String isbn) 
 {

     // Get the list of books for the genre
     LinkedList<Book> books = catalog.get(genre);

     // If genre does not exist
     if (books == null) 
     {
         System.out.println("Genre not found");
         return;
     }

     // Iterator to safely remove book while traversing
     Iterator<Book> iterator = books.iterator();

     while (iterator.hasNext()) 
     {
         Book book = iterator.next();

         // Check for matching ISBN
         if (book.getIsbn().equals(isbn)) 
         {
             iterator.remove();    
             isbnSet.remove(isbn);   
             System.out.println("Book borrowed successfully.");
             return;
         }
     }

     System.out.println("Book not found.");
 }

 // Method to display all books
 public void displayCatalog() 
 {

     // Traverse each genre
     for (String genre : catalog.keySet()) 
     {
         System.out.println("\nGenre: " + genre);

         // Traverse books under that genre
         for (Book book : catalog.get(genre)) 
         {
             System.out.println("  " + book);
         }
     }
 }
}
