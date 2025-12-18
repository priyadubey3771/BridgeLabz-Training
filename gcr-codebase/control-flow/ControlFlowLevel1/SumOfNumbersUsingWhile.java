
  import java.util.Scanner;
  class SumOfNumbersUsingWhile {
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  
   // taking variable number as input from the user and declaring variable total to store total  
   double total = 0.0;
   double number;
   System.out.println("enter the number:");
   number = input.nextDouble();
  
     // checking if the number is 0 or not and if the number is not 0, addind it to total and displaying total using while and break
     while(number>=0)
     {
     total = total + number;
	 System.out.println("enter the number:");
     number = input.nextDouble();
	 if(number<=0)
	 {
	 break;
	 }
	 else
	 {
	 continue;
	 }
     }
	  System.out.println("The total value is " + total);
	  
	  input.close();
	  }
	  }