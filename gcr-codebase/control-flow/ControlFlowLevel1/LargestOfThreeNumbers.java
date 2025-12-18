
 import java.util.Scanner;
 public class LargestOfThreeNumbers {
 public static void main(String[] args){
 Scanner input = new Scanner(System.in);
 
   // declaring variables and taking the numbers as input from the user
   int number1, number2, number3;
   System.out.println("enter the first number:");
   number1 = input.nextInt();
   System.out.println("enter the second number:");
   number2 = input.nextInt();
   System.out.println("enter the third number:");
   number3 = input.nextInt();
 
   // checking which of the three numbers is the largest and printing the result
   if(number1>number2 && number1>number3)
   System.out.println("First number is the largest");
   else if(number2>number1 && number2>number3)
   System.out.println("Second number is the largest");
   else 
   System.out.println("Third number is the largest");
   
   input.close();
   }
  }