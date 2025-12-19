
import java.util.Scanner;
public class MultiplicationTable {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

        // taking number as input from the user
		System.out.print("Enter a number:");
		int number= input.nextInt();

         // declaring an array table of size 10
		int[] table= new int[10];

        // storing the multiplication table
		for(int i=1; i<= 10; i++)
		{
			table[i-1]= number*i;
		}

        //displaying the multiplication table
		for(int i=1; i <=10; i++)
		{
			System.out.println(number+ " * " +i+ " = " + table[i-1]);
		}

		input.close();
		}
	}
