package com.smartlibrary;

// represents a borrowed book
class Book {

    String title;
    String author;

    // constructor
    public Book(String title, String author) 
    {
        this.title = title;
        this.author = author;
    }

    // display book details
    public void display() 
    {
        System.out.println(title + " by " + author);
    }
}
