
import java.util.Scanner;
public class YoungestAndTallest {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		String[] names= {"Amar","Akbar","Anthony"};
        int[] age= new int[3];
		double[] height= new double[3];

		System.out.println("Enter age and height of the friends:");
        for(int i=0; i<3; i++)
		{
			System.out.print(names[i]+ " Age: ");
			age[i]= input.nextInt();
			System.out.print(names[i] +" Height: ");
			height[i]= input.nextDouble();
		}

		int youngestIndex= 0;
		int tallestIndex= 0;
        for(int i=1;i<3;i++)
		{
			if(age[i]< age[youngestIndex])
			{
				youngestIndex= i;
			}

			if(height[i]>height[tallestIndex])
			{
				tallestIndex= i;
			}
		}

		System.out.println("\nYoungest Friend: "+ names[youngestIndex]);
		System.out.println("\nTallest Friend: "+ names[tallestIndex]);

		input.close();
		}
	}
