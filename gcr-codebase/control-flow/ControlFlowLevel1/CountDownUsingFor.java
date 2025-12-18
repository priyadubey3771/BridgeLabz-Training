
  import java.util.Scanner;
  class CountDownUsingFor{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  
  // taking the counter as the input from the user for countdown
   int counter;
   System.out.println("Enter the number for countdown:");
   counter = input.nextInt();
  
  // countdown from the number to 1 and printing the results using for
   for(int i = counter; i>=1 ; i--)
   {
   System.out.println(i);
   }
   
   input.close();
   }
   }