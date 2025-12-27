package com.constructor.level1;

public class EBook extends Book1 {

 private double fileSize; 

 // Parameterized constructor
 public EBook(String ISBN, String title, String author, double fileSize) 
 {
     super(ISBN, title, author);
     this.fileSize = fileSize;
 }
 // Method to display eBook details
 public void displayEBookDetails() 
 {
     System.out.println("ISBN: " + ISBN);     
     System.out.println("Title: " + title);    
     System.out.println("Author: " + getAuthor()); 
     System.out.println("File Size: " + fileSize + " MB");
 }
}
