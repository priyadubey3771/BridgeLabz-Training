package com.icecreamrush;

public class IceCreamRushDriver {
   public static void main(String[] args) {

        IceCreamFlavor[] flavors = {
            new IceCreamFlavor("Vanilla", 120),
            new IceCreamFlavor("Chocolate", 200),
            new IceCreamFlavor("Strawberry", 90),
            new IceCreamFlavor("Mango", 150),
            new IceCreamFlavor("Butterscotch", 110),
            new IceCreamFlavor("Pista", 80),
            new IceCreamFlavor("Black Currant", 140),
            new IceCreamFlavor("Coffee", 100)
        };

        System.out.println("Before Sorting:");
        for (IceCreamFlavor f : flavors) 
        {
            f.display();
        }

        IceCreamSorter.bubbleSort(flavors);

        System.out.println("\nAfter Sorting by Popularity:");
        for (IceCreamFlavor f : flavors) 
        {
            f.display();
        }
    }
}
