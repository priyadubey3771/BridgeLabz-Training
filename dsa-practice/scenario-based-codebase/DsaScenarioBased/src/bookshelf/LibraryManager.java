package bookshelf;

import java.util.*;
// manages the library catalog
public class LibraryManager {

    // genre
    private HashMap<String, LinkedList<Book>> genreMap = new HashMap<>();

    // to avoid duplicate books
    private HashSet<Book> bookSet = new HashSet<>();

    // add a book
    public void addBook(String genre, Book book) 
    {
    	// check duplication
        if (bookSet.contains(book)) 
        {
            System.out.println("Book already exists.");
            return;
        }

        // create genre list if not present
        genreMap.putIfAbsent(genre, new LinkedList<>());
        genreMap.get(genre).add(book);
        bookSet.add(book);
        System.out.println("Book added to " + genre + " genre.");
    }

    // remove a book
    public void removeBook(String genre, String isbn) 
    {
    	LinkedList<Book> books = genreMap.get(genre);

        if (books == null) 
        {
            System.out.println("Genre not found.");
            return;
        }

        Iterator<Book> it = books.iterator();
        while (it.hasNext()) 
        {
            Book b = it.next();
            if (b.isbn.equals(isbn)) 
            {
                it.remove();
                bookSet.remove(b);
                System.out.println("Book removed.");
                return;
            }
        }

        System.out.println("Book not found.");
    }

    // display genre-wise catalog
    public void displayCatalog() 
    {

        if (genreMap.isEmpty()) 
        {
            System.out.println("Library is empty.");
            return;
        }

        for (String genre : genreMap.keySet()) 
        {
            System.out.println("\nGenre: " + genre);
            for (Book b : genreMap.get(genre)) 
            {
                System.out.println("  " + b);
            }
        }
    }
}
