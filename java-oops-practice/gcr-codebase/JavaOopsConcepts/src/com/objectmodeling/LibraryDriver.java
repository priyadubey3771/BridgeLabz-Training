package com.objectmodeling;

public class LibraryDriver {
public static void main(String[] args) {

     // Creating Book objects
     Book book1 = new Book("Clean Code", "Robert C. Martin");
     Book book2 = new Book("Effective Java", "Joshua Bloch");
     Book book3 = new Book("Java: The Complete Reference", "Herbert Schildt");

     // Creating Library objects
     Library cityLibrary = new Library("City Library");
     Library collegeLibrary = new Library("College Library");

     // Adding books to libraries (Aggregation)
     cityLibrary.addBook(book1);
     cityLibrary.addBook(book2);
     collegeLibrary.addBook(book2);
     collegeLibrary.addBook(book3);

     // Displaying library details
     cityLibrary.displayLibraryBooks();
     collegeLibrary.displayLibraryBooks();

     // Book exists independently
     System.out.println("\nBook exists independently:");
     book1.displayBookDetails();
 }
}

