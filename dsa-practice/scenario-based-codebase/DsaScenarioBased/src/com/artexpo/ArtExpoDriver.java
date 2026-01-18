package com.artexpo;

public class ArtExpoDriver {
  public static void main(String[] args) {

        Artist[] registrations = {new Artist("Neha", 120), new Artist("Amit", 30),new Artist("Riya", 90),new Artist("Karan", 60),new Artist("Sneha", 150)};

        System.out.println("Before Sorting:");
        for (Artist a : registrations) 
        {
            a.display();
        }

        ArtExpoManager.insertionSort(registrations);

        System.out.println("\nAfter Sorting by Registration Time:");
        for (Artist a : registrations) 
        {
            a.display();
        }
    }
}
