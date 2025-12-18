
  import java.util.Scanner;
  class PositiveNegativeOrZero {
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  
  //taking the number as input from the user
  int number;
  System.out.println("enter the number:");
  number = input.nextInt();
  
  // checking if the number is positive,negative or zero and printing the result
   if(number>0)
   System.out.println("The number is positive");
   else if(number<0)
   System.out.println("The number is negative");
   else
   System.out.println("The number is zero");
	  
	  input.close();
	  }
	  }
  

  
  
  
  