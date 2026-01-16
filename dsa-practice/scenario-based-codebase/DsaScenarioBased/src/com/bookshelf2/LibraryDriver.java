package com.bookshelf2;

import java.util.Scanner;
public class LibraryDriver {
  public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	LibraryManager manager = new LibraryManager();
	
	int choice;

    do 
    {
        System.out.println("\n--- Library Menu ---");
        System.out.println("1. Add Book");
        System.out.println("2. Remove Book");
        System.out.println("3. Display Catalog");
        System.out.println("4. Exit");
        System.out.print("Enter choice: ");

        choice = sc.nextInt();
        sc.nextLine();

        switch (choice) 
        {
            case 1:
                System.out.print("Enter Genre: ");
                String genre = sc.nextLine();
                System.out.print("Enter ISBN: ");
                String isbn = sc.nextLine();
                System.out.print("Enter Title: ");
                String title = sc.nextLine();
                System.out.print("Enter Author: ");
                String author = sc.nextLine();

                manager.addBook(genre, new Book(isbn, title, author));
                break;

            case 2:
                System.out.print("Enter Genre: ");
                genre = sc.nextLine();
                System.out.print("Enter ISBN to remove: ");
                isbn = sc.nextLine();

                manager.removeBook(genre, isbn);
                break;

            case 3:
                manager.displayCatalog();
                break;

            case 4:
                System.out.println("Exiting Library System.");
                break;

            default:
                System.out.println("Invalid choice.");
        }

      } 
    while (choice != 4);

        sc.close();
    }
}
