
import java.util.Scanner;
public class StringComparison{

    boolean stringComparisonCharAt(String s1, String s2)
	{
	  if(s1.length() != s2.length())
	  {
		return false;
	  }
	  for(int i=0; i<s1.length(); i++)
	  {
		  if(s1.charAt(i) != s2.charAt(i))
		  {
		      return false;
		  }
	   }
	   return true;
	}
 public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   
	  System.out.println("Enter the first string:");
	  String str1 = input.next();
	  System.out.println("Enter the second string:");
	  String str2 = input.next();
	  
	  StringComparison s = new StringComparison();
	  boolean charAtResult = s.stringComparisonCharAt(str1, str2);
	  boolean equalsResult = str1.equals(str2);
	  
	  if(charAtResult==equalsResult)
	  {
		 System.out.println("both methods give the same result");
	  }
	  else
	  {
		  System.out.println("both methods give the different same result");
	  }
	  input.close();
	 }
	 }