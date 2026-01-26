package com.onlineticketbookingbytime;

public class EventDriver{
  public static void main(String[] args){
	  
        EventAVL avl = new EventAVL();
        Event root = null;

        root = avl.insert(root, 1800, "Music Concert");
        root = avl.insert(root, 1500, "Tech Talk");
        root = avl.insert(root, 2000, "Stand-up Comedy");
        root = avl.insert(root, 1700, "Dance Show");
        root = avl.insert(root, 1600, "Art Exhibition");

        System.out.println("Upcoming Events in Order:\n");
        avl.inorder(root);

        System.out.println("\nCancelling Event at time 1700\n");
        root = avl.delete(root, 1700);

        System.out.println("After Cancellation:\n");
        avl.inorder(root);
    }
}
