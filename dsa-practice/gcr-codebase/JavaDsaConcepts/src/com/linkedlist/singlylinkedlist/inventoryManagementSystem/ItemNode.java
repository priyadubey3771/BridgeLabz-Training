package com.linkedlist.singlylinkedlist.inventoryManagementSystem;

public class ItemNode {

 int itemId;
 String itemName;
 int quantity;
 double price;

 // Pointer to next item
 ItemNode next;

 // Constructor to initialize item details
 public ItemNode(int itemId, String itemName, int quantity, double price)
 {
     this.itemId = itemId;
     this.itemName = itemName;
     this.quantity = quantity;
     this.price = price;
     this.next = null;
 }
}
