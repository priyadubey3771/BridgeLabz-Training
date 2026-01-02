package com.encapsulation;

public class Book extends LibraryItem implements Reservable {

 private boolean isAvailable = true;
 private String borrowerName; 

 public Book(int itemId, String title, String author) 
 {
     super(itemId, title, author);
 }

 // Books can be borrowed for 14 days
 @Override
 public int getLoanDuration() 
 {
     return 14;
 }

 @Override
 public void reserveItem(String borrowerName) 
 {
     if (isAvailable) 
     {
         this.borrowerName = borrowerName;
         isAvailable = false;
         System.out.println("Book reserved successfully.");
     } 
     else 
     {
         System.out.println("Book is already reserved.");
     }
 }

 @Override
 public boolean checkAvailability() 
 {
     return isAvailable;
 }
}
