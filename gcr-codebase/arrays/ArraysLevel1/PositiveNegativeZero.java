
import java.util.Scanner;
public class PositiveNegativeZero {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

        // declaring the array numbers of size 5 and taking input from the user
		int[] numbers= new int[5];
		System.out.println("Enter 5 numbers:");
		for(int i=0; i<numbers.length; i++)
		{
			numbers[i]= input.nextInt();
		}
        
		//checking if the number is negative, positive or zero
		for(int i=0; i< numbers.length; i++)
		{
			
			if(numbers[i]>0)
				{
					//checking if the positive number is even or odd
					if(numbers[i]%2 ==0)
						{
								System.out.println(numbers[i]+ " is positive and even");
						}
					else
						{
								System.out.println(numbers[i]+ " is positive and odd");
						}
				}
			else if(numbers[i]<0)
				{
					System.out.println(numbers[i]+ " is negative");
				}
			else
				{
					System.out.println(numbers[i]+ " is zero");
				}
			}

		int first= numbers[0];
        int last= numbers[4];

        // checking if the fisrt and last element of array are equal or not
		if(first==last)
			{
					System.out.println("First and last elements are equal");
			}
		else if(first>last)
			{
					System.out.println("First element is greater than last element");
			}
		else
			{
					System.out.println("First element is less than last element");
			}

				input.close();
			}
		}
