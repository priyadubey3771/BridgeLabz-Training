
   import java.util.Scanner;
   public class MultiplicationTable {
   public static void main (String[] args){
   Scanner input = new Scanner(System.in);
   
   // taking number as input from the user
   int number;
   System.out.println("enter the number:");
   number = input.nextInt();
    
   // checking if the number is between 6 and 9 and displaying the table of the number
	if( number>=6 && number<=9)
	{
	    for(int i=1; i<=10; i++)
	    {
	    System.out.println(number + "*" + i + "=" + number*i);
        }
	}
		else
		System.out.println("number not valid");
		
		input.close();
	 }
	 }