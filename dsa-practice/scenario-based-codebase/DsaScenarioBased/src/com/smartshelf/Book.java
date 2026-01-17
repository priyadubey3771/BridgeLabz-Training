package com.smartshelf;

//represents a book in reading list
class Book {

 String title;

 // constructor
 public Book(String title) 
 {
     this.title = title;
 }

 // display book
 public void display() 
 {
     System.out.println(title);
 }
}
