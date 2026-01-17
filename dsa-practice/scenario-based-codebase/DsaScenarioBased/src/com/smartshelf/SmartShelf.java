package com.smartshelf;

// manages real-time book arrangement
public class SmartShelf {

    // insertion Sort by book title - alphabetical
    public static void sortBooks(Book[] books) 
    {

        int n = books.length;

        // start from second book
        for (int i = 1; i < n; i++) 
        {
        	Book key = books[i];
            int j = i - 1;

            // shift books greater than key one position ahead
            while (j >= 0 && books[j].title.compareTo(key.title) > 0) 
            {
                books[j + 1] = books[j];
                j--;
            }

            // place key book at correct position
            books[j + 1] = key;
        }
    }
}
