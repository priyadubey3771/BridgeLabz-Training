package com.musicapp;

public class SongDriver {
  public static void main(String[] args) {

        SongBST bst = new SongBST();
        Song root = null;

        root = bst.insert(root, 101, "Believer");
        root = bst.insert(root, 205, "Shape of You");
        root = bst.insert(root, 150, "Closer");
        root = bst.insert(root, 120, "Perfect");
        root = bst.insert(root, 300, "Attention");

        System.out.println("Playlist in Alphabetical Order:\n");
        bst.inorder(root);

        System.out.println("\nSearching Track ID 150:");
        Song s = bst.search(root, 150);

        if (s != null)
        {
            s.display();
        }
        else
        {
            System.out.println("Song not found");
        }
    }
}
