package com.streamapi.topfivetrendingmovies;

import java.util.*;
import java.util.stream.*;

public class MovieDriver {
  public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
            new Movie("Movie A", 8.5, 2022),
            new Movie("Movie B", 9.1, 2023),
            new Movie("Movie C", 7.9, 2021),
            new Movie("Movie D", 9.3, 2024),
            new Movie("Movie E", 8.8, 2023),
            new Movie("Movie F", 8.9, 2024),
            new Movie("Movie G", 7.5, 2020),
            new Movie("Movie H", 9.0, 2022),
            new Movie("Movie I", 8.7, 2023),
            new Movie("Movie J", 9.2, 2024)
        );

        List<Movie> topMovies = movies.stream()

            //filter recent movies after 2021
            .filter(movie -> movie.getReleaseYear() >= 2022)

            // sort by rating desc, then year desc
            .sorted(
                Comparator
                    .comparing(Movie::getRating).reversed()
                    .thenComparing(Movie::getReleaseYear).reversed()
            )

            // pick top 5
            .limit(5)

            // collect
            .collect(Collectors.toList());

        System.out.println("Top 5 Trending Movies:");
        topMovies.forEach(System.out::println);
    }
}
