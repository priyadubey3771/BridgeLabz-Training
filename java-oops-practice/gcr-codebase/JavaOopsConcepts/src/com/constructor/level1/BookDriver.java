package com.constructor.level1;

public class BookDriver {

    public static void main(String[] args) {

        // Using default constructor
        Book book1 = new Book();
        System.out.println("Book 1:");
        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getPrice());

        // Using parameterized constructor
        Book book2 = new Book("Effective Java", "Joshua Bloch", 550.00);
        System.out.println("\nBook 2:");
        System.out.println(book2.getTitle());
        System.out.println(book2.getAuthor());
        System.out.println(book2.getPrice());
    }
}
