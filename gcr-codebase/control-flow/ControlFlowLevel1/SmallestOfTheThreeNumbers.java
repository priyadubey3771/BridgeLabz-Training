
   import java.util.Scanner;
    public class  SmallestOfTheThreeNumbers {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	// declaring three variables to store the numbers from the user
	int number1,number2,number3;
	System.out.println("enter the first number");
	number1 = input.nextInt();
	System.out.println("enter the second number");
	number2 = input.nextInt();
	System.out.println("enter the third number");
	number3 = input.nextInt();
	
	 // checking if the first number is smallest among the three and printing the output 
	     if(number1<number2 && number1<number3)
         System.out.println("first number is the smallest");
         else
         System.out.println("first number is not the smallest");
		 
		 input.close();
		 }
	}
		 
         