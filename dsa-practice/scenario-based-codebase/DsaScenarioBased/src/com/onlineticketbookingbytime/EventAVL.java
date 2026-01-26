package com.onlineticketbookingbytime;

class EventAVL
{
    int height(Event node)
    {
        if (node == null)
        {
            return 0;
        }
        return node.height;
    }

    int getBalance(Event node)
    {
        if (node == null)
        {
            return 0;
        }
        return height(node.left) - height(node.right);
    }

    Event rightRotate(Event y)
    {
        Event x = y.left;
        Event T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    Event leftRotate(Event x)
    {
        Event y = x.right;
        Event T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    Event insert(Event root, int startTime, String eventName)
    {
        if (root == null)
        {
            return new Event(startTime, eventName);
        }

        if (startTime < root.startTime)
        {
            root.left = insert(root.left, startTime, eventName);
        }
        else if (startTime > root.startTime)
        {
            root.right = insert(root.right, startTime, eventName);
        }
        else
        {
            return root;
        }

        root.height = 1 + Math.max(height(root.left), height(root.right));

        int balance = getBalance(root);

        if (balance > 1 && startTime < root.left.startTime)
        {
            return rightRotate(root);
        }

        if (balance < -1 && startTime > root.right.startTime)
        {
            return leftRotate(root);
        }

        if (balance > 1 && startTime > root.left.startTime)
        {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        if (balance < -1 && startTime < root.right.startTime)
        {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    void inorder(Event root)
    {
        if (root != null)
        {
            inorder(root.left);
            root.display();
            inorder(root.right);
        }
    }

    Event findMin(Event node)
    {
        while (node.left != null)
        {
            node = node.left;
        }
        return node;
    }

    Event delete(Event root, int startTime)
    {
        if (root == null)
        {
            return null;
        }

        if (startTime < root.startTime)
        {
            root.left = delete(root.left, startTime);
        }
        else if (startTime > root.startTime)
        {
            root.right = delete(root.right, startTime);
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

            Event minNode = findMin(root.right);
            root.startTime = minNode.startTime;
            root.eventName = minNode.eventName;
            root.right = delete(root.right, minNode.startTime);
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
