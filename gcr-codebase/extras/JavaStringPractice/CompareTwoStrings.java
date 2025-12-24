
import java.util.Scanner;
public class CompareTwoStrings{

    // Method to compare two strings lexicographically
    static int compareStrings(String s1,String s2)
    {
        int i=0;
		while(true)
        {
            try
            {
                char ch1= s1.charAt(i);
                char ch2= s2.charAt(i);
				if(ch1!=ch2)
                {
                    return ch1-ch2;
                }
                i++;
            }
            catch(StringIndexOutOfBoundsException e)
            {
                if(s1.length()==s2.length())
                {
                    return 0;
                }
                else if(s1.length()<s2.length())
                {
                    return -1;
                }
                else
                {
                    return 1;
                }
            }
        }
    }
public static void main(String[] args){
  Scanner sc= new Scanner(System.in);

        // taking the strings as input
        System.out.print("Enter first string: ");
        String s1= sc.nextLine();
		System.out.print("Enter second string: ");
        String s2= sc.nextLine();
		int result= compareStrings(s1, s2);

        // comparing both the strings
        if(result==0)
        {
            System.out.println("Both strings are equal");
        }
        else if(result<0)
        {
            System.out.println("First string comes before second string");
        }
        else
        {
            System.out.println("First string comes after second string");
        }
     }
  }
