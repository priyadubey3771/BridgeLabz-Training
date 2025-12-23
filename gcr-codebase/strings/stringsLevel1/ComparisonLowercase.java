
import java.util.Scanner;
public class ComparisonLowercase{

  // user defined method to convert lowercase to uppercase
    String userDefinedLowercase(String s1)
	{
		String result= "";
		for(int i=0;i<s1.length();i++)
		{
		   char ch = s1.charAt(i);
		   if(ch>='A' && ch<='Z')
		   {
		      ch = (char) (ch+32);
		   }
		   result = result+ch;
		}
		return result;
	}
	// method to compare two strings
	boolean equalityComparison( String s1, String s2)
	{
	    if(s1.length()!=s2.length())
		{
			return false;
		}
		for(int i=0; i<s1.length(); i++)
		{
		     if(s1.charAt(i)!= s2.charAt(i))
			 {
			     return false;
			 }
	    }
		return true;
	}
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  
   // taking string as input from the user;
    System.out.println("enter the string: ");
	String str1= input.nextLine();
	ComparisonLowercase lower= new ComparisonLowercase();
	String userLowercase= lower.userDefinedLowercase(str1);
	// converting uppercase to lowecase using built in methods
	String builtInLowercase = str1.toLowerCase();
	boolean result = lower.equalityComparison(userLowercase,builtInLowercase);
	System.out.println("The string is "+ builtInLowercase);
	// displaying the result
	if(result==true)
	{
	   System.out.println("Both are equal");
	}
	else
	{
	    System.out.println("Both are not equal");
	}
	input.close();
	}
   }
		    
	   
     	