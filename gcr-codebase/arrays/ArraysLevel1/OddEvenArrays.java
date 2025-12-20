
import java.util.Scanner;
public class OddEvenArrays {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

        // taking the natural number as input from the user
		System.out.print("Enter a number:");
		int number=input.nextInt();
        
		//checking if the number is natural or not, if not then displaying invalid input
		if(number<=0)
		{
			System.out.println("Invalid input");
			input.close();
			return;
		}

        // declaring even and odd arrays of size [number/2 + 1]
		int[] even= new int[number/2+1];
		int[] odd= new int[number/2+1];

		int evenIndex=0;
		int oddIndex=0;

        // storing the even and odd numbers in the even and odd array
		for(int i= 1;i<= number; i++)
		{
			if(i%2 == 0)
				{
					even[evenIndex]= i;
					evenIndex++;
				}
			else
				{
					odd[oddIndex]= i;
					oddIndex++;
				}
		}

        //displaying the even and odd numbers
		System.out.println("Odd numbers:");
		for(int i=0; i< oddIndex; i++)
		{
			System.out.print(odd[i]+ " ");
		}
        System.out.println("\nEven numbers:");
		for(int i=0;i<evenIndex;i++)
		{
			System.out.print(even[i]+" ");
		}

			input.close();
	}
		}
