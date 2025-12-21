
import java.util.Scanner;
public class Roots {

     // method to find the root
    public double[] findRoots(double a,double b,double c) 
	{
        double delta= Math.pow(b,2) - 4*a*c;
		if (delta> 0) 
		{
            double root1= (-b +Math.sqrt(delta)) / (2*a);
            double root2= (-b- Math.sqrt(delta)) / (2*a);
            return new double[]{root1, root2};
        }
		else if (delta== 0) 
		{
            double root= -b/(2*a);
            return new double[]{root};
        } 
		else 
		{
            return new double[0];
        }
    }

  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
       
	   //taking a,b,c as input from the user
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        Roots result = new Roots();
        double[] roots = result.findRoots(a,b,c);

        //displaying the roots
        if (roots.length==2) 
		{
            System.out.println(roots[0]);
            System.out.println(roots[1]);
        } 
		else if (roots.length== 1) 
		{
            System.out.println(roots[0]);
        }

        input.close();
    }
}
