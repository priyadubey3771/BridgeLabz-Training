package com.universitydigitalrecordsystem;

public class StudentDriver {
  public static void main(String[] args) {

        StudentBST bst = new StudentBST();
        Student root = null;

        root = bst.insert(root, 105, "Aman");
        root = bst.insert(root, 102, "Neha");
        root = bst.insert(root, 110, "Ravi");
        root = bst.insert(root, 101, "Priya");
        root = bst.insert(root, 108, "Kunal");

        System.out.println("Student Records (Sorted by Roll Number):");
        bst.inorder(root);

        Student found = bst.search(root, 108);

        if (found != null) 
        {
            System.out.println("\nStudent Found:");
            found.display();
        }

        root = bst.delete(root, 102);

        System.out.println("\nAfter Deleting Roll 102:");
        bst.inorder(root);
    }
}
