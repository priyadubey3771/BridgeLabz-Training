
import java.util.Scanner;
public class MeanHeightFootballTeam {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

            // declaring the double height array of size 11 and declaring double sum
			double[] heights=new double[11];
			double sum= 0.0;

			System.out.println("Enter the height of 11 players:");
             
			 //taking height of all 11 players as input and adding them
			for(int i=0; i<heights.length; i++)
			{
				heights[i]= input.nextDouble();
				sum= sum + heights[i];
			}

            //calculating and displaying the sum
			double mean= sum/11;
            System.out.println("Mean height of the football team is "+ mean);

		input.close();
		}
	}
