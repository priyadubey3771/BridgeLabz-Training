package com.linkedlist.doublylinkedlist.undoRedoFunctionalityForTextEditor;

public class TextEditorHistory {

 private TextStateNode head;   
 private TextStateNode tail;     
 private TextStateNode current; 
 private int size;
 private final int MAX_SIZE = 10; 

 // Constructor
 public TextEditorHistory() 
 {
     head = tail = current = null;
     size = 0;
 }

 // Add a new text state
 public void addState(String text) 
 {

     TextStateNode newNode = new TextStateNode(text);

     // If editor is empty
     if (head == null) 
     {
         head = tail = current = newNode;
         size++;
         return;
     }

     // Remove forward history
     current.next = null;
     tail = current;

     // Add new state
     tail.next = newNode;
     newNode.prev = tail;
     tail = newNode;
     current = newNode;
     size++;

     // Maintain fixed history size
     if (size > MAX_SIZE) 
     {
         head = head.next;
         head.prev = null;
         size--;
     }
 }

 // Undo operation
 public void undo()
 {
     if (current != null && current.prev != null) 
     {
         current = current.prev;
     } 
     else
     {
         System.out.println("Nothing to undo");
     }
 }

 // Redo operation
 public void redo()
 {
     if (current != null && current.next != null) 
     {
         current = current.next;
     } 
     else 
     {
         System.out.println("Nothing to redo");
     }
 }

 // Display current text
 public void displayCurrentState()
 {
     if (current != null)
     {
         System.out.println("Current Text: " + current.content);
     } 
     else 
     {
         System.out.println("Editor is empty");
     }
 }
}
