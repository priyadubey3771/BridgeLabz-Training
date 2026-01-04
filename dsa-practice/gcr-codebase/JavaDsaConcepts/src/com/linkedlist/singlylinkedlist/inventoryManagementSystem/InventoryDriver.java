package com.linkedlist.singlylinkedlist.inventoryManagementSystem;

public class InventoryDriver {
  public static void main(String[] args) {

     InventoryLinkedList inventory = new InventoryLinkedList();

     // Add items
     inventory.addAtBeginning(101, "Laptop", 5, 50000);
     inventory.addAtEnd(102, "Mouse", 20, 500);
     inventory.addAtEnd(103, "Keyboard", 10, 1500);
     // Add at specific position
     inventory.addAtPosition(2, 104, "Monitor", 7, 12000);
     // Display inventory
     inventory.displayInventory();
     // Search operations
     inventory.searchByItemId(102);
     inventory.searchByItemName("Keyboard");
     // Update quantity
     inventory.updateQuantity(101, 8);
      // Calculate total value
     inventory.calculateTotalValue();
     // Sort by name (ascending)
     inventory.sortByNameAscending();
     System.out.println("\nAfter Sorting by Name (Ascending):");
     inventory.displayInventory();
     // Sort by price (descending)
     inventory.sortByPriceDescending();
     System.out.println("\nAfter Sorting by Price (Descending):");
     inventory.displayInventory();
     // Remove an item
     inventory.removeByItemId(103);

     // Final inventory
     inventory.displayInventory();
 }
}
