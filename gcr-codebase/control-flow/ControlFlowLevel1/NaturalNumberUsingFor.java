
   import java.util.Scanner;
   public class NaturalNumberUsingFor {
   public static void main (String[] args){
   Scanner input = new Scanner(System.in);
   
   // taking number as user input and declaring variable total and totalWithFormula
   int number, total=0 ,totalWithFormula;
   System.out.println("enter the number:");
   number = input.nextInt();
   totalWithFormula = number*(number+1)/2;
   
   // checking if the number is natural and comparing total calculated with loop and total calculated with formula using for
     for( int i = number; i>=0 ;i--)
     {
     total = total + i;
	 }
	 if(total == totalWithFormula)
	 System.out.println("The comparison is true and both are equal and result is "+ total);
	 else
	 System.out.println("The comparison is false and both are not equal");
	 
	 input.close();
	 }
	 }
   