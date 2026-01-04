package com.linkedlist.doublylinkedlist.undoRedoFunctionalityForTextEditor;

public class TextEditorDriver {
  public static void main(String[] args) {

     TextEditorHistory editor = new TextEditorHistory();

     // Typing text (new states)
     editor.addState("Hello");
     editor.addState("Hello World");
     editor.addState("Hello World!");
     editor.addState("Hello World! Java");
     editor.displayCurrentState();

     // Undo operations
     editor.undo();
     editor.displayCurrentState();
     editor.undo();
     editor.displayCurrentState();
    // Redo operation
     editor.redo();
     editor.displayCurrentState();

     // Add new text after undo (redo history cleared)
     editor.addState("Hello World! Java Programming");
     editor.displayCurrentState();

     // Try redo again
     editor.redo();
 }
}
