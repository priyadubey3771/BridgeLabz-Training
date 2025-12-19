
import java.util.Scanner;
public class MultiplicationTableSixToNine {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		
           // taking number as input from the user and array of size 4
			System.out.print("Enter a number:");
			int number=input.nextInt();
            int[] multiplicationResult=new int[4];
			int index=0;

             // storing the numbers from 6 to 9 in multiplicationResult and incrementing the index
			for(int i=6;i<=9;i++)
			{
				multiplicationResult[index]= number*i;
				index++;
			}

			index=0;
			// printing the multiplication table of the number from 6 to 9
            for(int i=6;i<=9;i++)
			{
				System.out.println(number+ " * " + i + " = " + multiplicationResult[index]);
				index++;
			}

			input.close();
		}
	}
