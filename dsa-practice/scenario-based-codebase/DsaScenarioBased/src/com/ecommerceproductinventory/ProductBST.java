package com.ecommerceproductinventory;

class ProductBST 
{

    Product insert(Product root, int sku, String name, double price) 
    {

        if (root == null) 
        {
            return new Product(sku, name, price);
        }

        if (sku < root.sku) 
        {
            root.left = insert(root.left, sku, name, price);
        } 
        else if (sku > root.sku) 
        {
            root.right = insert(root.right, sku, name, price);
        }

        return root;
    }

    Product search(Product root, int sku) 
    {

        if (root == null || root.sku == sku) 
        {
            return root;
        }

        if (sku < root.sku) 
        {
            return search(root.left, sku);
        }

        return search(root.right, sku);
    }

    void inorder(Product root) 
    {
        if (root != null) 
        {
            inorder(root.left);
            root.display();
            inorder(root.right);
        }
    }

    void updatePrice(Product root, int sku, double newPrice) 
    {
        Product found = search(root, sku);

        if (found != null) 
        {
            found.price = newPrice;
            System.out.println("Price updated successfully.");
        }
        else 
        {
            System.out.println("Product not found.");
        }
    }
}
