package com.ecommerceproductinventory;

public class ProductDriver {
    public static void main(String[] args) {

        ProductBST bst = new ProductBST();
        Product root = null;

        root = bst.insert(root, 5003, "Laptop", 55000);
        root = bst.insert(root, 5001, "Mouse", 800);
        root = bst.insert(root, 5005, "Keyboard", 1500);
        root = bst.insert(root, 5002, "Monitor", 12000);
        root = bst.insert(root, 5004, "Printer", 7000);

        System.out.println("All Products (Sorted by SKU):");
        bst.inorder(root);

        System.out.println("\nCustomer Searching for SKU 5002:");
        Product p = bst.search(root, 5002);

        if (p != null) 
        {
            p.display();
        }

        System.out.println("\nAdmin Updating Price of SKU 5003:");
        bst.updatePrice(root, 5003, 53000);

        System.out.println("\nAfter Price Update:");
        bst.inorder(root);
    }
}
