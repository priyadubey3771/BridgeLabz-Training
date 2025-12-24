
import java.util.Scanner;
public class FibonacciSequenceGenerator{

    // Method to generate and print Fibonacci sequence
    static void generateFibonacci(int terms)
    {
        int first= 0;
        int second= 1;
		if(terms<= 0)
        {
            System.out.println("Please enter a positive number of terms");
            return;
        }

        System.out.print("Fibonacci Sequence: ");
		for(int i=1; i<=terms; i++)
        {
            System.out.print(first+ " ");
			int next= first+ second;
            first= second;
            second= next;
        }
        System.out.println();
    }

public static void main(String[] args){
   Scanner sc= new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();
		generateFibonacci(terms);
     }
   }
