package com.encapsulation;

public class Magazine extends LibraryItem implements Reservable {

 private boolean isAvailable = true;
 private String borrowerName;

 public Magazine(int itemId, String title, String author) 
 {
     super(itemId, title, author);
 }

 // Magazines can be borrowed for 7 days
 @Override
 public int getLoanDuration() 
 {
     return 7;
 }

 @Override
 public void reserveItem(String borrowerName) 
 {
     if (isAvailable) 
     {
         this.borrowerName = borrowerName;
         isAvailable = false;
         System.out.println("Magazine reserved successfully.");
     } 
     else 
     {
         System.out.println("Magazine is already reserved.");
     }
 }

 @Override
 public boolean checkAvailability() 
 {
     return isAvailable;
 }
}
