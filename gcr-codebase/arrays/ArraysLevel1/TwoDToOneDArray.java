
import java.util.Scanner;
public class TwoDToOneDArray {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

        // taking the number of rows and columns as the input from the user
		System.out.print("Enter number of rows:");
		int rows= input.nextInt();
		System.out.print("Enter number of columns:");
		int columns= input.nextInt();

        // creating the double dimensional array matrix and taking the input
		int[][] matrix= new int[rows][columns];
        System.out.println("Enter elements of the matrix:");
		for(int i=0;i<rows;i++)
		{
			for(int j=0; j<columns; j++)
			{
				matrix[i][j]= input.nextInt();
			}
		}

        // creating the single dimensional array of the size of double array i.e, rows*columns
		int[] array= new int[rows*columns];
		int index= 0;

		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<columns; j++)
			{
				array[index]= matrix[i][j];
				index++;
			}
		}
        
		// displaying the elements of 2D array in 1D array
		System.out.println("Elements in 1D array:");

		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}

		input.close();
		
		}
			}
