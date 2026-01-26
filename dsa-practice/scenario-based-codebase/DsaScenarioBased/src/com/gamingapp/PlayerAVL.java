package com.gamingapp;

class PlayerAVL
{
    // Get height
    int height(Player node)
    {
        if (node == null)
        {
            return 0;
        }
        return node.height;
    }

    // Get balance factor
    int getBalance(Player node)
    {
        if (node == null)
        {
            return 0;
        }
        return height(node.left) - height(node.right);
    }

    // Right rotation
    Player rightRotate(Player y)
    {
        Player x = y.left;
        Player T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // Left rotation
    Player leftRotate(Player x)
    {
        Player y = x.right;
        Player T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // Insert player
    Player insert(Player root, int score, String name)
    {
        if (root == null)
        {
            return new Player(score, name);
        }

        if (score < root.score)
        {
            root.left = insert(root.left, score, name);
        }
        else if (score > root.score)
        {
            root.right = insert(root.right, score, name);
        }
        else
        {
            return root;
        }

        root.height = 1 + Math.max(height(root.left), height(root.right));

        int balance = getBalance(root);

        // LL Case
        if (balance > 1 && score < root.left.score)
        {
            return rightRotate(root);
        }

        // RR Case
        if (balance < -1 && score > root.right.score)
        {
            return leftRotate(root);
        }

        // LR Case
        if (balance > 1 && score > root.left.score)
        {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // RL Case
        if (balance < -1 && score < root.right.score)
        {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    // Inorder traversal
    void inorder(Player root)
    {
        if (root != null)
        {
            inorder(root.left);
            root.display();
            inorder(root.right);
        }
    }

    // Show top 10 players
    void showTopPlayers(Player root, int[] count)
    {
        if (root != null && count[0] < 10)
        {
            showTopPlayers(root.right, count);

            if (count[0] < 10)
            {
                root.display();
                count[0]++;
            }

            showTopPlayers(root.left, count);
        }
    }

    // Find minimum node
    Player findMin(Player node)
    {
        while (node.left != null)
        {
            node = node.left;
        }
        return node;
    }

    // Delete player
    Player delete(Player root, int score)
    {
        if (root == null)
        {
            return null;
        }

        if (score < root.score)
        {
            root.left = delete(root.left, score);
        }
        else if (score > root.score)
        {
            root.right = delete(root.right, score);
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

            Player minNode = findMin(root.right);
            root.score = minNode.score;
            root.name = minNode.name;
            root.right = delete(root.right, minNode.score);
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
