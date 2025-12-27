package com.constructor.level1;

public class Book1 {

 public String ISBN;
 protected String title;
 private String author;

 // Parameterized constructor
 public Book1(String ISBN, String title, String author) 
 {
     this.ISBN = ISBN;
     this.title = title;
     this.author = author;
 }
 // Public getter for author
 public String getAuthor() 
 {
     return author;
 }
 // Public setter for author
 public void setAuthor(String author) 
 {
     this.author = author;
 }
}

