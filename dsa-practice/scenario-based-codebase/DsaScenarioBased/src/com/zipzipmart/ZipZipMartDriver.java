package com.zipzipmart;

public class ZipZipMartDriver {
   public static void main(String[] args) {

	   SalesRecord[] records = {new SalesRecord("2026-01-10", 1200),new SalesRecord("2026-01-08", 500), new SalesRecord("2026-01-10", 800),new SalesRecord("2026-01-07", 1500),new SalesRecord("2026-01-08", 700)};
	   
	   System.out.println("Before Sorting:");
        for (SalesRecord r : records) 
        {
            r.display();
        }

        ZipZipMartSorter.mergeSort(records, 0, records.length - 1);
        System.out.println("\nAfter Sorting (Date + Amount):");
        
        for (SalesRecord r : records) 
        {
            r.display();
        }
    }
}
