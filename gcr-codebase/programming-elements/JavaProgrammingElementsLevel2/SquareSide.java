
import java.util.*;
public class SquareSide {  
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		//Taking the perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();
		
		//calculating the side of the square
        double side = perimeter / 4;
		
		//displaying the side of the square
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}


