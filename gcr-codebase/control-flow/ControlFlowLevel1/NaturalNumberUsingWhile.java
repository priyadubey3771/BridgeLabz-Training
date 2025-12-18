
  import java.util.Scanner;
   public class NaturalNumberUsingWhile {
   public static void main (String[] args){
   Scanner input = new Scanner(System.in);
   
   // taking number as user input and declaring variable total and totalWithFormula
   int number, total=0 ,totalWithFormula;
   System.out.println("enter the number:");
   number = input.nextInt();
   totalWithFormula = number*(number+1)/2;
   
   // checking if the number is natural and comparing total calculated with loop and total calculated with formula 
    while(number>=0)
    {
     total = total + number;
	 number--;
	 }
	 if(total == totalWithFormula)
	 System.out.println("Both are equal and the result is " + total);
	 else
	 System.out.println("The comparison is false and both are not equal");
	 
	 input.close();
	 }
	 }
   
   