package com.medwarehouse;

public class MedWarehouseDriver {
  public static void main(String[] args) {

     // medicine records collected from branches
     Medicine[] medicines = {new Medicine("Paracetamol", 12),  new Medicine("Amoxicillin", 5),new Medicine("Cough Syrup", 20), new Medicine("Vitamin C", 8), new Medicine("Insulin", 3)};

     // display medicines before sorting
     System.out.println("Medicines Before Sorting:");
     for (Medicine m : medicines) 
     {
         m.display();
     }

     // apply merge sort
     MergeSort.sort(medicines, 0, medicines.length - 1);

     // display medicines after sorting
     System.out.println("\nMedicines Sorted by Expiry Date:");
     for (Medicine m : medicines) 
     {
         m.display();
     }
     
   }
}
