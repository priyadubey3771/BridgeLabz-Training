package com.inheritance.singleinheritance;

public class Author extends Book {

 private String name;
 private String bio;

 // Constructor
 public Author(String title, int publicationYear, String name, String bio) 
 {
	// calling Book constructor
     super(title, publicationYear); 
     this.name = name;
     this.bio = bio;
 }

 // Overriding displayInfo() to include author details
 @Override
 public void displayInfo() 
 {
     super.displayInfo();
     System.out.println("Author Name: " + name);
     System.out.println("Author Bio: " + bio);
 }
}

