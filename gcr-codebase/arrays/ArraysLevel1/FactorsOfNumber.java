
import java.util.Scanner;
public class FactorsOfNumber {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

        //taking number as input from the user
		System.out.print("Enter a number:");
		int number= input.nextInt();

        // creating array factors of size maxFactor
		int maxFactor= 10;
		int[] factors= new int[maxFactor];
		int index= 0;

        // finding factor through the loop
		for(int i=1; i<= number; i++)
		{
			if(number%i== 0)
			{
				if(index== maxFactor)
				{
					maxFactor= maxFactor*2;
					int[] temp= new int[maxFactor];

					for(int j=0; j< factors.length; j++)
					{
						temp[j]= factors[j];
					}

					factors= temp;
				}

			factors[index]= i;
			index++;
			}
		}

     // displaying the factors of the number
		System.out.println("Factors of " +number+ " are:");

		for(int i=0; i<index; i++)
		{
				System.out.print(factors[i] + " ");
		}

		input.close();
		}
	}
