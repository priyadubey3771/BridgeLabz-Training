
import java.util.Scanner;
public class CharacterFrequencyNestedLoop{

    // Method to find frequency of characters using nested loops
    static String[] findCharacterFrequency(String text)
    {
        char[] characters=text.toCharArray();
        int[] frequency=new int[characters.length];
		for(int i=0;i<characters.length;i++)
        {
            frequency[i]=1;
        }
        for(int i=0;i<characters.length;i++)
        {
            if(characters[i]=='0')
            {
                continue;
            }
			for(int j=i+1;j<characters.length;j++)
            {
                if(characters[i]==characters[j])
                {
                    frequency[i]++;
                    characters[j]='0';
                }
            }
        }
        int count=0;
        for(int i=0;i<characters.length;i++)
        {
            if(characters[i]!='0')
            {
                count++;
            }
        }
        String[] result=new String[count];
        int index=0;
		for(int i=0;i<characters.length;i++)
        {
            if(characters[i]!='0')
            {
                result[index]=characters[i]+ " : "+frequency[i];
                index++;
            }
        }
		return result;
    }

public static void main(String[] args){
   Scanner sc=new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input=sc.next();
		String[] frequencyResult= findCharacterFrequency(input);
		System.out.println("\nCharacter Frequency:");
        System.out.println(" ");
		for(int i=0;i<frequencyResult.length;i++)
        {
            System.out.println(frequencyResult[i]);
        }
     }
   }
