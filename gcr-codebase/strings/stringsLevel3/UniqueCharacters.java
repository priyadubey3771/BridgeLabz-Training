
import java.util.Scanner;
public class UniqueCharacters{

    // Method to find length 
    static int findLength(String text) 
	{
		int count=0;
		try 
		{
            while(true) 
			{
                text.charAt(count);
                count++;
            }
        } 
		catch(StringIndexOutOfBoundsException e) 
		{
        }
		return count;
    }
	// Method to find unique characters using charAt()
    static char[] findUniqueCharacters(String text) 
	{
		int len=findLength(text);
        char[] temp=new char[len];
        int uniqueCount=0;
        for(int i=0;i<len;i++) 
		{
			char current= text.charAt(i);
            boolean isUnique= true;
			//loop to check duplicates
            for(int j=0;j<i;j++) 
			{
                if(current==text.charAt(j)) 
				{
                    isUnique=false;
                    break;
                }
            }
			if (isUnique) 
			{
                temp[uniqueCount]=current;
                uniqueCount++;
            }
        }
		
        char[] result=new char[uniqueCount];
        for (int i=0;i<uniqueCount;i++) 
		{
            result[i]=temp[i];
        }

        return result;
    }

public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input= sc.next();
		char[] uniqueChars= findUniqueCharacters(input);
		System.out.println("Unique characters:");
        for(int i=0; i<uniqueChars.length;i++) 
		{
            System.out.print(uniqueChars[i] + " ");
        }
     }
   }
