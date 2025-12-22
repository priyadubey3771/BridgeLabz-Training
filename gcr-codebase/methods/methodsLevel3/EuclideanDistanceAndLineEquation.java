
import java.util.Scanner;
public class EuclideanDistanceAndLineEquation{

	//Method to calculate Euclidean distance between two points
	public static double findDistance(double x1,double y1,double x2,double y2)
	{
		double dx= Math.pow(x2-x1,2);
		double dy= Math.pow(y2-y1,2);
		double distance= Math.sqrt(dx+dy);
		return distance;
	}
	//Method to calculate slope and y-intercept
	public static double[] findLineEquation(double x1,double y1,double x2,double y2)
	{
		double[] result=new double[2];
		double m=(y2-y1)/(x2-x1);
		double b = y1-(m*x1);
		result[0]=m;
		result[1]=b;
		return result;
	}
 public static void main(String[] args){
   Scanner input=new Scanner(System.in);

	//Taking inputs for first point
	System.out.print("Enter x1: ");
	double x1= input.nextDouble();
	System.out.print("Enter y1: ");
	double y1= input.nextDouble();

	//Taking inputs for second point
	System.out.print("Enter x2: ");
	double x2= input.nextDouble();
	System.out.print("Enter y2: ");
	double y2= input.nextDouble();

	//Calculating distance
	double distance= findDistance(x1,y1,x2,y2);
	//Calculating line equation
	double[] line= findLineEquation(x1,y1,x2,y2);
	//Displaying results
	System.out.println("Euclidean Distance: "+distance);
	System.out.println("Equation of Line: y = "+line[0]+"x + "+line[1]);

	input.close();
	 }
    }
