
import java.util.Scanner;
public class StringComparison1{

  //method to store characters into array from string 
    char[] getCharacters(String s1)
  {
     char[] arr = new char[s1.length()];
	 for(int i=0; i< s1.length(); i++)
	 {
		arr[i] = s1.charAt(i);
	 }
	 return arr;
   }
   // method to compare the character arrays
   boolean comparisonOfCharArrays(char[] s1, char[] s2)
   {
       if(s1.length!=s2.length)
	   {
	     return false;
	   }
	   for(int i=0;i<s1.length;i++)
		{
		   if(s1[i]!= s2[i])
		   {
			  return false;
		   }
		}
			
		return true;	
	}
   
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  //taking string as input from the user
   System.out.println("enter the string");
   String str = sc.next();
   
   // creating objects and calling the methods
   char[] builtInArray = str.toCharArray();
   StringComparison1 comp = new StringComparison1();
   char[] userDefinedArray = comp.getCharacters(str);
   boolean result = comp.comparisonOfCharArrays(builtInArray, userDefinedArray);
   // displaying the result
   if(result == true)
   {
       System.out.println("Both the strings are equal");
   }
   else
   {
       System.out.println("Both the strings are not equal");
   }
   sc.close();
  }
 }
   
      
  


