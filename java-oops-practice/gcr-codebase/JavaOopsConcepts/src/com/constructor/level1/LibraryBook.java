package com.constructor.level1;

public class LibraryBook {

    private String title;
    private String author;
    private double price;
    private boolean available;

    // Parameterized constructor
    public LibraryBook(String title, String author, double price, boolean available) 
    {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    // Method to borrow a book
    public void borrowBook() 
    {
        if(available) 
        {
            available = false;
            System.out.println("Book borrowed successfully.");
        } 
        else 
        {
            System.out.println("Book is currently not available.");
        }
    }

    // Getter methods
    public String getTitle() 
    {
        return title;
    }
    public String getAuthor() 
    {
        return author;
    }
    public double getPrice()
    {
        return price;
    }
    public boolean isAvailable() 
    {
        return available;
    }
 }
