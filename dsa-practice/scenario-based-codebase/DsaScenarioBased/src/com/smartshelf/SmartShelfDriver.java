package com.smartshelf;

public class SmartShelfDriver {
  public static void main(String[] args) {

        Book[] readingList = {new Book("Algorithms"), new Book("Data Structures"), new Book("Java Programming"), new Book("Operating Systems"),new Book("Computer Networks")};

        System.out.println("Before Sorting:");
        for (Book b : readingList) 
        {
            b.display();
        }

        SmartShelf.sortBooks(readingList);

        System.out.println("\nAfter Alphabetical Sorting:");
        for (Book b : readingList) 
        {
            b.display();
        }
    }
}
