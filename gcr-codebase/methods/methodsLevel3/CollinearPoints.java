
import java.util.Scanner;
public class CollinearPoints{

    // Method using slope formula
    public boolean checkCollinearUsingSlope(double x1,double y1,double x2, double y2,double x3, double y3) 
	{
		double slopeAB=(y2-y1)/(x2-x1);
        double slopeBC=(y3-y2)/(x3-x2);
        double slopeAC=(y3-y1)/(x3-x1);
		return (slopeAB==slopeBC) && (slopeBC==slopeAC);
    }

    // Method using area of triangle formula
    public boolean checkCollinearUsingArea(double x1, double y1,double x2, double y2,double x3, double y3) 
	{
		double area= 0.5 * Math.abs(x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2));
		return area== 0;
    }

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   
        CollinearPoints obj = new CollinearPoints();
		System.out.print("Enter x1 y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
		System.out.print("Enter x2 y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
		System.out.print("Enter x3 y3: ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        boolean slopeResult = obj.checkCollinearUsingSlope(x1,y1,x2,y2,x3,y3);
        boolean areaResult = obj.checkCollinearUsingArea(x1,y1,x2,y2,x3,y3);

        System.out.println("\nUsing Slope Formula: " +(slopeResult ? "Collinear" : "Not Collinear"));
		System.out.println("Using Area Formula: " +(areaResult ? "Collinear" : "Not Collinear"));
		
		sc.close();
    }
}
