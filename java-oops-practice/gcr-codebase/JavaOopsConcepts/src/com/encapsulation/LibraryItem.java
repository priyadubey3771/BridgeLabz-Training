package com.encapsulation;

//Abstract class representing a generic library item
public abstract class LibraryItem {

 // Encapsulated fields
 private int itemId;
 private String title;
 private String author;

 // Constructor
 public LibraryItem(int itemId, String title, String author) 
 {
     this.itemId = itemId;
     this.title = title;
     this.author = author;
 }

 // Getters 
 public int getItemId() 
 {
     return itemId;
 }

 public String getTitle() 
 {
     return title;
 }

 public String getAuthor() 
 {
     return author;
 }

 // Abstract method (implemented by subclasses)
 public abstract int getLoanDuration();

 // Concrete method shared by all items
 public void getItemDetails() 
 {
     System.out.println("Item ID : " + itemId);
     System.out.println("Title   : " + title);
     System.out.println("Author  : " + author);
 }
}
