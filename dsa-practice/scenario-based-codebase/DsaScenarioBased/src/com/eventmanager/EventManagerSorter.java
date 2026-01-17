package com.eventmanager;

// Handles Quick Sort for ticket prices
public class EventManagerSorter {

    // Quick Sort method
    public static void quickSort(Ticket[] tickets, int low, int high) {

        if (low < high) {

            // Partition index
            int pivotIndex = partition(tickets, low, high);

            // Recursively sort left and right sub-arrays
            quickSort(tickets, low, pivotIndex - 1);
            quickSort(tickets, pivotIndex + 1, high);
        }
    }

    // Partition logic
    private static int partition(Ticket[] tickets, int low, int high) {

        int pivot = tickets[high].price;   // choosing last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {

            // Place smaller prices before pivot
            if (tickets[j].price < pivot) {
                i++;

                // Swap tickets[i] and tickets[j]
                Ticket temp = tickets[i];
                tickets[i] = tickets[j];
                tickets[j] = temp;
            }
        }

        // Place pivot at correct position
        Ticket temp = tickets[i + 1];
        tickets[i + 1] = tickets[high];
        tickets[high] = temp;

        return i + 1;
    }
}
