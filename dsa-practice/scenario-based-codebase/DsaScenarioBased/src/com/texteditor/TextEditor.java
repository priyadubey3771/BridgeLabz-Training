package com.texteditor;

import java.util.Stack;
// manages text editing with undo/redo
public class TextEditor {

    private String content = "";        
    private Stack<Action> undoStack = new Stack<>();
    private Stack<Action> redoStack = new Stack<>();

    // insert text
    public void insert(String text) 
    {
        content += text;
        undoStack.push(new Action("insert", text));
        redoStack.clear();  
        System.out.println("Inserted: " + text);
    }

    // delete text
    public void delete(int length) 
    {
	    if (length > content.length()) 
	    {
	        System.out.println("Not enough text to delete.");
	        return;
	    }
	
	    String removed = content.substring(content.length() - length);
	    content = content.substring(0, content.length() - length);
	    undoStack.push(new Action("delete", removed));
	    redoStack.clear();
	    System.out.println("Deleted: " + removed);
    }

    // undo last action
    public void undo() 
    {
        if (undoStack.isEmpty()) 
        {
            System.out.println("Nothing to undo.");
            return;
        }

        Action last = undoStack.pop();
        
        if(last.type.equals("insert")) 
        {
            content = content.substring(0, content.length() - last.text.length());
        } 
        else if(last.type.equals("delete")) 
        {
            content += last.text;
        }
        redoStack.push(last);
        System.out.println("Undo performed.");
    }

    // redo last undone action
    public void redo() 
    {
        if (redoStack.isEmpty()) 
        {
            System.out.println("Nothing to redo.");
            return;
        }

        Action last = redoStack.pop();

        if (last.type.equals("insert")) 
        {
            content += last.text;
        } 
        else if(last.type.equals("delete")) 
        {
            content = content.substring(0, content.length() - last.text.length());
        }

        undoStack.push(last);
        System.out.println("Redo performed.");
    }

    // display current content
    public void display() 
    {
        System.out.println("Current Text: " + content);
    }
}
