
import java.util.Scanner;
public class ComparisonUppercase{

    // user defined method to compare the uppercase strings
     	
		String userDefinedUppercase(String s1)
		{
		   String result = "";
		   for(int i=0; i<s1.length() ;i++) 
		   {
		        char ch = s1.charAt(i);
		        if( ch>= 'a' && ch<='z')
				{
					ch = (char) (ch-32);
				}
				result = result + ch;
			}
			 return result;
		}
		boolean isEquals(String s1, String s2)
		{
		    if(s1.length()!= s2.length())
			{
				return false;
			}
			else
			{ 
			    for(int i=0; i<s1.length();i++)
				{
				    if(s1.charAt(i)!= s2.charAt(i))
					{
						return false;
					}
				}
			}
			return true;
			
		}
  public static void main(String args[]){
   Scanner input = new Scanner(System.in);
   
   System.out.println("Enter the string:");
   String str1 = input.nextLine();
   ComparisonUppercase upper = new ComparisonUppercase();
   String userUppercase = upper.userDefinedUppercase(str1);
   String builtInUppercase = str1.toUpperCase();
   boolean result = upper.isEquals(userUppercase,builtInUppercase);
   System.out.println("string in uppercase is:" + builtInUppercase);
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