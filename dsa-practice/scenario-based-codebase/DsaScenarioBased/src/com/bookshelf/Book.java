package com.bookshelf;
class Book {

 private String isbn;
 private String title;
 private String author;

 // Constructor to initialize book details
 public Book(String isbn, String title, String author) 
 {
     this.isbn = isbn;
     this.title = title;
     this.author = author;
 }

 // Getter method for ISBN
 public String getIsbn() 
 {
     return isbn;
 }

 // Overriding toString() to print book details clearly
 @Override
 public String toString() 
 {
     return title + " by " + author + " (ISBN: " + isbn + ")";
 }
}
