package com.browserbuddy;

//Node class for Doubly Linked List
class HistoryNode 
{

 String url;             
 HistoryNode prev;       
 HistoryNode next;       

 // Constructor to initialize URL
 public HistoryNode(String url) 
 {
     this.url = url;
     this.prev = null;
     this.next = null;
 }
}
