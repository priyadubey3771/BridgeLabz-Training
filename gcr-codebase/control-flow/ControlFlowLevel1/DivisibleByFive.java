
   import java.util.Scanner;
   public class DivisibleByFive {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    // creating the variable number to store the input from the user
    int number;
	System.out.println("enter the number");
    number = sc.nextInt();
    
	//checking if the number is divisible by five or not and 
     if(number%5 == 0)
     System.out.println("number is divisible by 5");
     else
     System.out.println("number is not divisible by 5");
   
   sc.close();
   }
   }
  