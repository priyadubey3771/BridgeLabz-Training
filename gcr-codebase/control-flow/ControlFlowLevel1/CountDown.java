
   import java.util.Scanner;
   public class CountDown{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
  
  // taking the counter as input from the user
   int counter;
   System.out.println("Enter the number for countdown:");
   counter = input.nextInt();
  
  //printing the value of the counter and decrementing the counter until the value of the counter is 1
   while(counter>=1)
   {
   System.out.println(counter);
   counter--;
   }
   
   input.close();
   }
   }