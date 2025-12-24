
import java.util.Scanner;
public class CharacterFrequencyUsingUnique{

    // Method to find unique characters using nested loops
    static char[] uniqueCharacters(String text)
    {
        char[] temp=new char[text.length()];
        int uniqueCount=0;
		for(int i=0;i<text.length();i++)
        {
            char current=text.charAt(i);
            boolean isUnique= true;
			for(int j=0;j<i;j++)
            {
                if(current==text.charAt(j))
                {
                    isUnique=false;
                    break;
                }
            }
			if(isUnique)
            {
                temp[uniqueCount]=current;
                uniqueCount++;
            }
        }
		char[] result=new char[uniqueCount];
        for(int i=0;i<uniqueCount;i++)
        {
            result[i]=temp[i];
        }

        return result;
    }
	// Method to find frequency using unique characters
     static String[][] findCharacterFrequency(String text)
     {
        int[] frequency=new int[256]; 
		// Count frequency of each character
        for(int i=0;i<text.length();i++)
        {
            char ch=text.charAt(i);
            frequency[ch]++;
        }
        char[] uniqueChars=uniqueCharacters(text);
		String[][] result=new String[uniqueChars.length][2];
		
		// Storing character and its frequency
        for(int i=0;i<uniqueChars.length;i++)
        {
            char ch=uniqueChars[i];
            result[i][0]=String.valueOf(ch);
            result[i][1]=String.valueOf(frequency[ch]);
        }
		return result;
    }
public static void main(String[] args){
   Scanner sc= new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input=sc.next();

		String[][] frequencyResult=findCharacterFrequency(input);
		System.out.println("\nCharacter\tFrequency");
        System.out.println(" ");
		for(int i=0;i<frequencyResult.length;i++)
        {
            System.out.println(frequencyResult[i][0]+"\t\t"+frequencyResult[i][1]);
        }
     }
   }
