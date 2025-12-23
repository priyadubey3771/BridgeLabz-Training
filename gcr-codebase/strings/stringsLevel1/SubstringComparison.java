
import java.util.Scanner;
public class SubstringComparison{

   String substringUsingCharAt(String text, int startIndex, int endIndex)
	{
        String result = "";
	   for(int i=startIndex; i<endIndex; i++)
	   {
	       result = result + text.charAt(i);
	   }
	   return result;
	}
    String substringUsingBuiltInMethod(String text,int startIndex, int endIndex)
    {
        	return text.substring(startIndex,endIndex);
	}

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
     System.out.println("enter the string:");
	 String str1 = input.next();
	 System.out.println("enter the start index:");
	 int input1 = input.nextInt();
	 System.out.println("enter the end index:");
	 int input2 = input.nextInt();
	 
	 
	 SubstringComparison comp = new SubstringComparison();
	 String result1 = comp.substringUsingCharAt(str1,input1,input2);
	 String result2 = comp.substringUsingBuiltInMethod(str1,input1,input2);
	 boolean equalsResult = result1.equals(result2);
	 
	 if(equalsResult == true)
	 {
		System.out.println("both substring are equal");
	 }
	 else
	 {
	    System.out.println("both substring are not equal");
	 }
	 
	 input.close();
	 }
	}
		
	       