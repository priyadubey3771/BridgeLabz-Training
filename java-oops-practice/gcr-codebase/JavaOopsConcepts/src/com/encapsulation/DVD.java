package com.encapsulation;

//DVD implementation
public class DVD extends LibraryItem implements Reservable {

 private boolean isAvailable = true;
 private String borrowerName;

 public DVD(int itemId, String title, String author) 
 {
     super(itemId, title, author);
 }

 // DVDs can be borrowed for 3 days
 @Override
 public int getLoanDuration() 
 {
     return 3;
 }

 @Override
 public void reserveItem(String borrowerName) 
 {
     if (isAvailable) 
     {
         this.borrowerName = borrowerName;
         isAvailable = false;
         System.out.println("DVD reserved successfully.");
     }
     else 
     {
         System.out.println("DVD is already reserved.");
     }
 }

 @Override
 public boolean checkAvailability() 
 {
     return isAvailable;
 }
}
