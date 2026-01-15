package com.traincompanion;

// manages the doubly linked list of compartments
public class TrainManager {

    private Compartment head;
    private Compartment tail;

    // add compartment at the end
    public void addCompartment(String name) 
    {
        Compartment newCompartment = new Compartment(name);

        if (head == null) 
        {
            head = tail = newCompartment;
        } 
        else 
        {
            tail.next = newCompartment;
            newCompartment.prev = tail;
            tail = newCompartment;
        }
    }

    // remove a compartment by name
    public void removeCompartment(String name) 
    {
        Compartment current = head;

        while (current != null) 
        {
            if (current.name.equalsIgnoreCase(name)) 
            {

                if (current == head) 
                {
                    head = current.next;
                    if (head != null) head.prev = null;
                }
                else if(current == tail) 
                {
                    tail = current.prev;
                    tail.next = null;
                }
                else 
                {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }

                System.out.println(name + " compartment removed.");
                return;
            }
            current = current.next;
        }

        System.out.println("Compartment not found.");
    }

    // traverse forward
    public void traverseForward() 
    {
        Compartment current = head;
        System.out.print("Train (Forward): ");

        while (current != null) 
        {
            System.out.print(current.name + " <-> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    // traverse backward
    public void traverseBackward() 
    {
        Compartment current = tail;
        System.out.print("Train (Backward): ");

        while (current != null) 
        {
            System.out.print(current.name + " <-> ");
            current = current.prev;
        }
        System.out.println("NULL");
    }

// displaying adjacent compartments
public void showAdjacent(String name) {
    Compartment current = head;

    while (current != null) 
    {
        if (current.name.equalsIgnoreCase(name)) 
        {

            System.out.println("Current: " + current.name);
            System.out.println("Previous: " + (current.prev != null ? current.prev.name : "None"));
            System.out.println("Next: " + (current.next != null ? current.next.name : "None"));
            return;
        }
        current = current.next;
    }

    System.out.println("Compartment not found.");
 }
}

