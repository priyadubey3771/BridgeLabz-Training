package com.collectors.librarybookstatistics;

import java.util.*;
import java.util.stream.Collectors;
import java.util.IntSummaryStatistics;

public class Driver {
    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Book1", "Fiction", 300),
                new Book("Book2", "Fiction", 250),
                new Book("Book3", "Science", 400),
                new Book("Book4", "Science", 350),
                new Book("Book5", "History", 500));

        // Group by genre and summarize page statistics
        Map<String, IntSummaryStatistics> statsByGenre = books.stream().collect(Collectors.groupingBy(Book::getGenre,Collectors.summarizingInt(Book::getPages)));

        // Print the result
        statsByGenre.forEach((genre, stats) -> 
        {	System.out.println("Genre: " + genre);
            System.out.println("Total Pages: " + stats.getSum());
            System.out.println("Average Pages: " + stats.getAverage());
            System.out.println("Maximum Pages: " + stats.getMax());
            System.out.println();});
    }
}
