
import java.util.Scanner;
public class TrimStringUsingCharAt{

    // Method to find start and end index
    int[] findTrimIndexes(String text)
	{
		int start= 0;
        int end= text.length()-1;
		// Triming leading spaces
        while(start<=end && text.charAt(start)== ' ')
		{
            start++;
        }
		// Triming trailing spaces
        while(end>= start && text.charAt(end)== ' ') 
		{
            end--;
        }
		return new int[]{start, end};
    }
	// Method to create substring using charAt()
    String createSubstring(String text,int start,int end) 
	{
		String result = "";
		for (int i=start;i<=end;i++) 
		{
            result=result+text.charAt(i);
        }
		return result;
    }

    // Method to compare two strings using charAt()
    boolean compareStrings(String s1,String s2) 
	{
		if(s1.length()!= s2.length()) 
		{
            return false;
        }

        for(int i=0;i<s1.length();i++) 
		{
            if (s1.charAt(i)!=s2.charAt(i)) 
			{
                return false;
            }
        }

        return true;
    }

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        TrimStringUsingCharAt obj= new TrimStringUsingCharAt();

        // taking user input
        System.out.println("Enter a string with leading and trailing spaces:");
        String input= sc.nextLine();
		
		// User defined trim logic
        int[] indexes= obj.findTrimIndexes(input);
        String trimmedUser= obj.createSubstring(input,indexes[0],indexes[1]);
        // Built in trim
        String trimmedBuiltIn = input.trim();

        // Comparing results
        boolean isSame= obj.compareStrings(trimmedUser,trimmedBuiltIn);

        // Displaying results
        System.out.println("\nUser-defined trimmed string: [" + trimmedUser + "]");
        System.out.println("Built-in trimmed string: [" +trimmedBuiltIn + "]");
        System.out.println("Both results are same: " +isSame);
    }
}
