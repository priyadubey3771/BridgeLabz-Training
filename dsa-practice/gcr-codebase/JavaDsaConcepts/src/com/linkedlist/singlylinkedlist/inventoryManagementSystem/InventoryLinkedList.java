package com.linkedlist.singlylinkedlist.inventoryManagementSystem;

public class InventoryLinkedList {

 private ItemNode head;

 // Constructor
 public InventoryLinkedList()
 {
     head = null;
 }

 // Add item at beginning
 public void addAtBeginning(int id, String name, int qty, double price) 
 {
     ItemNode newNode = new ItemNode(id, name, qty, price);
     newNode.next = head;
     head = newNode;
 }

 // Add item at end
 public void addAtEnd(int id, String name, int qty, double price) {
     ItemNode newNode = new ItemNode(id, name, qty, price);

     if (head == null)
     {
         head = newNode;
         return;
     }

     ItemNode temp = head;
     while (temp.next != null) 
     {
         temp = temp.next;
     }
     temp.next = newNode;
 }

 // Add item at specific position 
 public void addAtPosition(int position, int id, String name, int qty, double price) 
 {

     if (position <= 1 || head == null)
     {
         addAtBeginning(id, name, qty, price);
         return;
     }

     ItemNode temp = head;
     int count = 1;

     while (temp.next != null && count < position - 1) 
     {
         temp = temp.next;
         count++;
     }

     ItemNode newNode = new ItemNode(id, name, qty, price);
     newNode.next = temp.next;
     temp.next = newNode;
 }

 // Remove item by Item ID
 public void removeByItemId(int id) {

     if (head == null) 
     {
         System.out.println("Inventory is empty");
         return;
     }

     // If head node needs to be removed
     if (head.itemId == id) 
     {
         head = head.next;
         System.out.println("Item removed: " + id);
         return;
     }

     ItemNode temp = head;

     while (temp.next != null) 
     {
         if (temp.next.itemId == id) 
         {
             temp.next = temp.next.next;
             System.out.println("Item removed: " + id);
             return;
         }
         temp = temp.next;
     }

     System.out.println("Item not found: " + id);
 }

 // Update quantity by Item ID
 public void updateQuantity(int id, int newQty) {

     ItemNode temp = head;

     while (temp != null)
     {
         if (temp.itemId == id) 
         {
             temp.quantity = newQty;
             System.out.println("Quantity updated for Item ID: " + id);
             return;
         }
         temp = temp.next;
     }

     System.out.println("Item not found: " + id);
 }

 // Search item by Item ID
 public void searchByItemId(int id) {

     ItemNode temp = head;

     while (temp != null) 
     {
         if (temp.itemId == id)
         {
             displayItem(temp);
             return;
         }
         temp = temp.next;
     }

     System.out.println("Item not found: " + id);
 }

 // Search item by Item Name
 public void searchByItemName(String name) {

     ItemNode temp = head;
     boolean found = false;

     while (temp != null) 
     {
         if (temp.itemName.equalsIgnoreCase(name)) 
         {
             displayItem(temp);
             found = true;
         }
         temp = temp.next;
     }

     if (!found)
     {
         System.out.println("Item not found: " + name);
     }
 }

 // Calculate total inventory value
 public void calculateTotalValue() {

     double totalValue = 0.0;
     ItemNode temp = head;

     while (temp != null) 
     {
         totalValue += temp.price * temp.quantity;
         temp = temp.next;
     }

     System.out.println("Total Inventory Value: ₹" + totalValue);
 }

 // Sort inventory by Item Name (Ascending)
 public void sortByNameAscending() {

     if (head == null) return;

     ItemNode i, j;
     for (i = head; i.next != null; i = i.next)
     {
         for (j = i.next; j != null; j = j.next)
         {
             if (i.itemName.compareToIgnoreCase(j.itemName) > 0) 
             {
                 swapData(i, j);
             }
         }
     }
 }

 // Sort inventory by Price
 public void sortByPriceDescending() {

     if (head == null) return;

     ItemNode i, j;
     for (i = head; i.next != null; i = i.next)
     {
         for (j = i.next; j != null; j = j.next)
         {
             if (i.price < j.price) 
             {
                 swapData(i, j);
             }
         }
     }
 }

 // Display all items
 public void displayInventory() {

     if (head == null) 
     {
         System.out.println("Inventory is empty");
         return;
     }

     ItemNode temp = head;
     System.out.println("\nInventory Items:");

     while (temp != null)
     {
         displayItem(temp);
         temp = temp.next;
     }
 }

 // Helper method to swap item data
 private void swapData(ItemNode a, ItemNode b) {

     int id = a.itemId;
     String name = a.itemName;
     int qty = a.quantity;
     double price = a.price;

     a.itemId = b.itemId;
     a.itemName = b.itemName;
     a.quantity = b.quantity;
     a.price = b.price;

     b.itemId = id;
     b.itemName = name;
     b.quantity = qty;
     b.price = price;
 }

 // Helper method to display one item
 private void displayItem(ItemNode item) {
     System.out.println( "ID: " + item.itemId + ", Name: " + item.itemName + ", Quantity: " + item.quantity + ", Price: ₹" + item.price);
 }
}
