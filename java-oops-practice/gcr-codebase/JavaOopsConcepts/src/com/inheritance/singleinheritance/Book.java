package com.inheritance.singleinheritance;

//Superclass representing Book
public class Book {

 protected String title;
 protected int publicationYear;

 // Constructor
 public Book(String title, int publicationYear) 
 {
     this.title = title;
     this.publicationYear = publicationYear;
 }

 // Method to display book information
 public void displayInfo() 
 {
     System.out.println("Book Title: " + title);
     System.out.println("Publication Year: " + publicationYear);
 }
}
