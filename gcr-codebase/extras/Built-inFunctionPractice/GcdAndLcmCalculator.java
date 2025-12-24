
import java.util.Scanner;
public class GcdAndLcmCalculator{

    // Method to take two numbers as input
    static int[] takeInput(Scanner sc)
    {
        int[] numbers= new int[2];
		System.out.print("Enter first number: ");
        numbers[0]= sc.nextInt();
		System.out.print("Enter second number: ");
        numbers[1]= sc.nextInt();
		return numbers;
    }

    // Method to calculate GCD using Euclidean algorithm
    static int calculateGCD(int a,int b)
    {
        while(b!=0)
        {
            int temp= b;
            b= a%b;
            a= temp;
        }
        return a;
    }
	// Method to calculate LCM
    static int calculateLCM(int a,int b)
    {
        int gcd= calculateGCD(a,b);
        return (a*b)/gcd;
    }
	// Method to display result
    static void displayResult(int a, int b, int gcd, int lcm)
    {
        System.out.println("GCD of " +a+ " and " +b+ " is: " + gcd);
        System.out.println("LCM of " +a+ " and " +b+ " is: " + lcm);
    }
public static void main(String[] args){
   Scanner sc= new Scanner(System.in);

        int[] numbers= takeInput(sc);

        int a= numbers[0];
        int b= numbers[1];
		int gcd= calculateGCD(a,b);
        int lcm= calculateLCM(a, b);
		displayResult(a, b, gcd, lcm);
     }
   }
