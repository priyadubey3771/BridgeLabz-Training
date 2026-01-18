package com.icecreamrush;

// handles sorting of ice cream flavors
public class IceCreamSorter {
// bubble Sort by popularity - descending order
   public static void bubbleSort(IceCreamFlavor[] flavors) {

        int n = flavors.length;

        for (int i = 0; i < n - 1; i++) 
        {
        	// compare adjacent flavors
            for (int j = 0; j < n - i - 1; j++) 
            {
            	// swap if left flavor is less popular
                if (flavors[j].soldCount < flavors[j + 1].soldCount) 
                {

                    IceCreamFlavor temp = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = temp;
                }
            }
        }
    }
}
