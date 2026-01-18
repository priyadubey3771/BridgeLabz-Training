package geomeasure;

import java.util.ArrayList;
import java.util.Scanner;

public class GeoMeasureDriver {
  public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Line> lineList = new ArrayList<>();

        System.out.println("Enter details for 2 lines:");

        for (int i = 1; i <= 2; i++) 
        {
            System.out.println("\nLine " + i);
            System.out.print("Enter x1: ");
            double x1 = sc.nextDouble();
            System.out.print("Enter y1: ");
            double y1 = sc.nextDouble();
            System.out.print("Enter x2: ");
            double x2 = sc.nextDouble();
            System.out.print("Enter y2: ");
            double y2 = sc.nextDouble();

            lineList.add(new Line(x1, y1, x2, y2));
            
        }

        // compare the two lines
        LineComparator.compareLines(lineList.get(0), lineList.get(1));
        sc.close();
        
    }
}
