package com.gamingapp;

public class PlayerDriver{
  public static void main(String[] args){
	  
        PlayerAVL avl = new PlayerAVL();
        Player root = null;

        root = avl.insert(root, 500, "Aarav");
        root = avl.insert(root, 800, "Neha");
        root = avl.insert(root, 300, "Rohit");
        root = avl.insert(root, 900, "Priya");
        root = avl.insert(root, 700, "Karan");
        root = avl.insert(root, 650, "Simran");

        System.out.println("All Players Sorted by Score:\n");
        avl.inorder(root);

        System.out.println("\nTop Players:\n");
        avl.showTopPlayers(root, new int[]{0});

        System.out.println("\nDeleting player with score 700\n");
        root = avl.delete(root, 700);

        System.out.println("After Deletion:\n");
        avl.inorder(root);
    }
}
