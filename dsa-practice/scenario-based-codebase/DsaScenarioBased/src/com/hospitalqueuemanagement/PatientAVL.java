package com.hospitalqueuemanagement;

class PatientAVL
{
    int height(Patient node)
    {
        if (node == null)
        {
            return 0;
        }
        return node.height;
    }

    int getBalance(Patient node)
    {
        if (node == null)
        {
            return 0;
        }
        return height(node.left) - height(node.right);
    }

    Patient rightRotate(Patient y)
    {
        Patient x = y.left;
        Patient T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    Patient leftRotate(Patient x)
    {
        Patient y = x.right;
        Patient T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    Patient insert(Patient root, int checkInTime, String name)
    {
        if (root == null)
        {
            return new Patient(checkInTime, name);
        }

        if (checkInTime < root.checkInTime)
        {
            root.left = insert(root.left, checkInTime, name);
        }
        else if (checkInTime > root.checkInTime)
        {
            root.right = insert(root.right, checkInTime, name);
        }
        else
        {
            return root;
        }

        root.height = 1 + Math.max(height(root.left), height(root.right));

        int balance = getBalance(root);

        if (balance > 1 && checkInTime < root.left.checkInTime)
        {
            return rightRotate(root);
        }

        if (balance < -1 && checkInTime > root.right.checkInTime)
        {
            return leftRotate(root);
        }

        if (balance > 1 && checkInTime > root.left.checkInTime)
        {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        if (balance < -1 && checkInTime < root.right.checkInTime)
        {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    void inorder(Patient root)
    {
        if (root != null)
        {
            inorder(root.left);
            root.display();
            inorder(root.right);
        }
    }

    Patient findMin(Patient node)
    {
        while (node.left != null)
        {
            node = node.left;
        }
        return node;
    }

    Patient delete(Patient root, int checkInTime)
    {
        if (root == null)
        {
            return null;
        }

        if (checkInTime < root.checkInTime)
        {
            root.left = delete(root.left, checkInTime);
        }
        else if (checkInTime > root.checkInTime)
        {
            root.right = delete(root.right, checkInTime);
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

            Patient minNode = findMin(root.right);
            root.checkInTime = minNode.checkInTime;
            root.name = minNode.name;
            root.right = delete(root.right, minNode.checkInTime);
        }

        root.height = 1 + Math.max(height(root.left), height(root.right));

        int balance = getBalance(root);

        if (balance > 1 && getBalance(root.left) >= 0)
        {
            return rightRotate(root);
        }

        if (balance > 1 && getBalance(root.left) < 0)
        {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        if (balance < -1 && getBalance(root.right) <= 0)
        {
            return leftRotate(root);
        }

        if (balance < -1 && getBalance(root.right) > 0)
        {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }
}
