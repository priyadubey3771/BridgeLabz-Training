
import java.util.Scanner;
public class CharacterFrequency{

    // Method to find frequency of characters
    static String[][] findCharacterFrequency(String text)
    {
        int[] frequency=new int[256];

        // Counting frequency of each character
        for(int i=0;i<text.length();i++)
        {
            char ch=text.charAt(i);
            frequency[ch]++;
        }
		// Counting number of unique characters
        int count=0;
        for(int i=0;i<text.length();i++)
        {
            char ch=text.charAt(i);
            if(frequency[ch]!=0)
            {
                count++;
                frequency[ch]= -frequency[ch];
            }
        }
		// Creating 2D array for character and frequency
        String[][] result=new String[count][2];
        int index=0;
		// Storing characters and their frequencies
        for(int i=0;i<text.length();i++)
        {
            char ch=text.charAt(i);
            if(frequency[ch]<0)
            {
                result[index][0]=String.valueOf(ch);
                result[index][1]=String.valueOf(-frequency[ch]);
                frequency[ch]=0;
                index++;
            }
        }

        return result;
    }

public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next();
		String[][] frequencyResult= findCharacterFrequency(input);
		System.out.println("\nCharacter\tFrequency");
        System.out.println(" ");
		for(int i=0;i<frequencyResult.length;i++)
        {
            System.out.println(frequencyResult[i][0]+"\t\t"+frequencyResult[i][1]);
        }
     }
   }
