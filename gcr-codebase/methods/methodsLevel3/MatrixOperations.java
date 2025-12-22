
import java.util.Random;
import java.util.Scanner;
public class MatrixOperations{

    // Method to create a random matrix
    public int[][] createMatrix(int rows, int cols) 
	{
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
		for (int i=0;i< rows;i++) 
		{
            for (int j=0; j<cols;j++) 
			{
                matrix[i][j]= rand.nextInt(9)+1;
            }
        }
        return matrix;
    }
	// Method to add two matrices
    public int[][] addMatrices(int[][] A, int[][] B) 
	{
        int rows= A.length;
        int cols= A[0].length;
        int[][] result= new int[rows][cols];
		for (int i=0; i<rows; i++) 
		{
            for (int j=0;j<cols;j++) 
			{
                result[i][j]= A[i][j]+ B[i][j];
            }
        }
        return result;
    }
	// Method to subtract two matrices
    public int[][] subtractMatrices(int[][] A, int[][] B) 
	{
        int rows= A.length;
        int cols= A[0].length;
        int[][] result= new int[rows][cols];

        for (int i=0;i<rows; i++) 
		{
            for (int j=0;j<cols;j++) 
			{
                result[i][j]= A[i][j]- B[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public int[][] multiplyMatrices(int[][] A,int[][] B) 
	{
        int rows= A.length;
        int cols= B[0].length;
        int common= B.length;
		int[][] result= new int[rows][cols];

        for (int i=0;i<rows;i++) 
		{
            for (int j=0;j<cols;j++) 
			{
                for (int k=0;k<common;k++) 
				{
                    result[i][j]+= A[i][k]* B[k][j];
                }
            }
        }
        return result;
    }
	// Method to display a matrix
    public void displayMatrix(int[][] matrix) 
	{
        for (int i = 0; i < matrix.length; i++) 
		{
			for (int j = 0; j < matrix[i].length; j++) 
			{
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}

    }
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        MatrixOperations obj = new MatrixOperations();
		System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
		System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
		
		int[][] A = obj.createMatrix(rows, cols);
        int[][] B = obj.createMatrix(rows, cols);
		System.out.println("\nMatrix A:");
        obj.displayMatrix(A);
		System.out.println("\nMatrix B:");
        obj.displayMatrix(B);
		System.out.println("\nAddition:");
        obj.displayMatrix(obj.addMatrices(A, B));
		System.out.println("\nSubtraction:");
        obj.displayMatrix(obj.subtractMatrices(A, B));

        if (rows == cols) 
		{
            System.out.println("\nMultiplication:");
            obj.displayMatrix(obj.multiplyMatrices(A, B));
        } 
		else 
		{
            System.out.println("\nMultiplication not possible for given dimensions.");
        }

        sc.close();
     }
   }
