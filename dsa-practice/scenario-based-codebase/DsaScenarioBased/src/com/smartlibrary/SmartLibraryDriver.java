package com.smartlibrary;

public class SmartLibraryDriver {
  public static void main(String[] args) {

        Book[] borrowedBooks = {
            new Book("Algorithms", "CLRS"),
            new Book("Data Structures", "Sahni"),
            new Book("Operating Systems", "Galvin"),
            new Book("Computer Networks", "Tanenbaum"),
            new Book("Database Systems", "Silberschatz")
        };

        System.out.println("Before Sorting:");
        for (Book b : borrowedBooks) 
        {
            b.display();
        }

        LibrarySorter.insertionSort(borrowedBooks);

        System.out.println("\nAfter Alphabetical Sorting:");
        for (Book b : borrowedBooks) 
        {
            b.display();
        }
    }
}
