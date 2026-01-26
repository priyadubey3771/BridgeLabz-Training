package com.universitydigitalrecordsystem;

class StudentBST {

    // Insert student
    Student insert(Student root, int roll, String name) {

        if (root == null) 
        {
            return new Student(roll, name);
        }

        if (roll < root.roll) 
        {
            root.left = insert(root.left, roll, name);
        } 
        else if(roll > root.roll) 
        {
            root.right = insert(root.right, roll, name);
        }

        return root;
    }

    // Inorder traversal (sorted)
    void inorder(Student root) 
    {
        if (root != null) 
        {
            inorder(root.left);
            root.display();
            inorder(root.right);
        }
    }

    // Search student
    Student search(Student root, int roll) 
    {

        if (root == null || root.roll == roll) 
        {
            return root;
        }

        if (roll < root.roll) 
        {
            return search(root.left, roll);
        }

        return search(root.right, roll);
    }

    // Delete student
    Student delete(Student root, int roll) 
    {
    	if (root == null) return null;

        if (roll < root.roll) 
        {
            root.left = delete(root.left, roll);
        }
        else if(roll > root.roll) 
        {
            root.right = delete(root.right, roll);
        }
        else 
        {
        	if (root.left == null) 
        	{
        		return root.right;
        	}
            if (root.right == null) 
            {	
            	return root.left;
            }
            Student minNode = findMin(root.right);
            root.roll = minNode.roll;
            root.name = minNode.name;
            root.right = delete(root.right, minNode.roll);
        }

        return root;
    }

    // Find minimum node
    Student findMin(Student root) 
    {
        while (root.left != null) 
        {
            root = root.left;
        }
        return root;
    }
}
