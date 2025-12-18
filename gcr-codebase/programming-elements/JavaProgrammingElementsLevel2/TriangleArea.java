
import java.util.*;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		//Taking the base and height in cm
         System.out.print("Enter base in cm: ");
        double base = sc.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();
		
		//calculating the area of the triangle
        double areaCm = 0.5 * base * height;
        double areaInch = areaCm / (2.54 * 2.54);
		
		//displaying the area of the triangle
        System.out.println("The Area of the triangle in sq in is " + areaInch + " and sq cm is " + areaCm);

    }
}

