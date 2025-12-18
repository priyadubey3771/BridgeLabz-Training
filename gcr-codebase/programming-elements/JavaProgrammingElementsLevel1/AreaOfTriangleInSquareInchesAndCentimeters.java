import java.util.* ;

//create class AreaOfTriangleInSquareInchesAndCentimeters to calculate volume of earth
public class AreaOfTriangleInSquareInchesAndCentimeters {
   public static void main (String args []) {
   Scanner input = new Scanner(System.in) ;
   
   
   //create variable base and height 
   double base ;
   double height ;
   double areaInCentimeters ;
   double areaInInches ;
   
   //Taking user input for base and height
   System.out.println("Enter the base of the triangle") ;
   base = input.nextDouble() ;
   System.out.println("Enter the height of the triangle") ;
   height = input.nextDouble() ;
   
   // calculating area of triangle
   areaInInches = 0.5 * base * height ;
   areaInCentimeters = areaInInches * 0.5 * base * height ;
   
   //Displaying the area of triangle in inches and centimeters
   System.out.println("Area of triangle in square inches is " +areaInInches+" and in square centimeters is " +areaInCentimeters) ;
   
   
   }
}
