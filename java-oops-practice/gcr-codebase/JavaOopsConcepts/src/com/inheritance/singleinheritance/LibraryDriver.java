package com.inheritance.singleinheritance;

public class LibraryDriver {
   public static void main(String[] args) {

        //book reference holding author object
        Book book = new Author("Object Oriented Programming",2023,"James Gosling","Pioneer of the Java programming language");

        // Display information
        book.displayInfo();
    }
}
