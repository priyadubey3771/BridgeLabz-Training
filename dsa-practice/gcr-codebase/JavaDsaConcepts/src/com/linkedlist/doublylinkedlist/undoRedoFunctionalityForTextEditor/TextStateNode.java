package com.linkedlist.doublylinkedlist.undoRedoFunctionalityForTextEditor;

public class TextStateNode 
{

 String content;        
 TextStateNode prev;      
 TextStateNode next;      

 // Constructor
 public TextStateNode(String content) 
 {
     this.content = content;
     this.prev = null;
     this.next = null;
 }
}
