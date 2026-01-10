package com.bookshelf;

public class BookDriver {
 public static void main(String[] args) {

 BookShelf shelf = new BookShelf();

 // Adding books
 shelf.addBook("Fiction", new Book("101", "The Alchemist", "Paulo Coelho"));
 shelf.addBook("Fiction", new Book("102", "1984", "George Orwell"));
 shelf.addBook("Science", new Book("201", "A Brief History of Time", "Stephen Hawking"));

 // Displaying all books
 shelf.displayCatalog();

 // Borrowing a book
 shelf.borrowBook("Fiction", "102");

 // Displaying catalog after borrowing
 shelf.displayCatalog();
 }
}
