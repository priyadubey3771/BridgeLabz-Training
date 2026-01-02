package com.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class LibraryDriver {
  public static void main(String[] args) {

        //LibraryItem reference
        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book(1, "Java Programming", "James Gosling"));
        items.add(new Magazine(2, "Tech Monthly", "Editorial Team"));
        items.add(new DVD(3, "Inception", "Christopher Nolan"));

        for (LibraryItem item : items)
        {

            item.getItemDetails();
            System.out.println("Loan Duration : " + item.getLoanDuration() + " days");

            // Interface-based access
            Reservable reservable = (Reservable) item;
            System.out.println("Available     : " + reservable.checkAvailability());
            reservable.reserveItem("Priya");

            System.out.println("--------------------------------");
        }
    }
}
