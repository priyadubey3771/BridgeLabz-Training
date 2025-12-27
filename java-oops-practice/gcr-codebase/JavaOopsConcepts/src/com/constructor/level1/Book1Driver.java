package com.constructor.level1;

public class Book1Driver {
 public static void main(String[] args) {

     EBook ebook = new EBook("978-0134685991", "Effective Java", "Joshua Bloch", 5.2);

     // Displaying eBook details
     ebook.displayEBookDetails();

     System.out.println("\nUpdating Author...\n");
     // Updating author using setter method
     ebook.setAuthor("J. Bloch");
     
     // Displaying updated details
     ebook.displayEBookDetails();
  }
}
