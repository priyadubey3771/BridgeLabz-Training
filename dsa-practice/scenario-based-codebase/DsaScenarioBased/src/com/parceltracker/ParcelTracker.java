package com.parceltracker;

// manages parcel delivery stages
public class ParcelTracker {

    private StageNode head;

    // initialize default delivery stages
    public ParcelTracker() 
    {
        head = new StageNode("Packed");
        head.next = new StageNode("Shipped");
        head.next.next = new StageNode("In Transit");
        head.next.next.next = new StageNode("Delivered");
    }

    // traverse forward through stages
    public void trackParcel() 
    {

        if (head == null) 
        {
            System.out.println("Parcel status unavailable (missing).");
            return;
        }

        StageNode current = head;
        System.out.println("Parcel Tracking:");

        while (current != null) 
        {
            System.out.println("→ " + current.stageName);
            current = current.next;
        }
    }

    // add custom checkpoint after a given stage
    public void addCheckpoint(String afterStage, String newStage) 
    {

        StageNode current = head;
        while (current != null && !current.stageName.equals(afterStage)) 
        {
            current = current.next;
        }

        if (current == null) 
        {
            System.out.println("Stage not found. Cannot add checkpoint.");
            return;
        }

        StageNode newNode = new StageNode(newStage);
        newNode.next = current.next;
        current.next = newNode;
        System.out.println("Checkpoint added: " + newStage);
        
    }

    // simulate lost parcel
    public void markParcelLost() 
    {
        head = null;
        System.out.println("Parcel marked as lost.");
    }
}
