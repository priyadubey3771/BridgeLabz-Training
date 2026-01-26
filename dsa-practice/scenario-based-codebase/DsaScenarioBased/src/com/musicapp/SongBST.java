package com.musicapp;

class SongBST {

    // Insert song
    Song insert(Song root, int trackId, String title) {

        if (root == null) 
        {
            return new Song(trackId, title);
        }

        // Alphabetical order by title
        if (title.compareToIgnoreCase(root.title) < 0) 
        {
            root.left = insert(root.left, trackId, title);
        } 
        else if (title.compareToIgnoreCase(root.title) > 0) 
        {
            root.right = insert(root.right, trackId, title);
        }

        return root;
    }

    // Inorder traversal (alphabetical)
    void inorder(Song root) 
    {
        if (root != null) 
        {
            inorder(root.left);
            root.display();
            inorder(root.right);
        }
    }

    // Search by Track ID
    Song search(Song root, int trackId) 
    {
        if (root == null || root.trackId == trackId) 
        {
            return root;
        }

        Song leftResult = search(root.left, trackId);
        if (leftResult != null)
        {
            return leftResult;
        }

        return search(root.right, trackId);
    }
}
