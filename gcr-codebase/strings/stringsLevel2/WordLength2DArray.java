
import java.util.Scanner;
public class WordLength2DArray {

    // Method to find string length without using length()
    int findLength(String text) 
	{
        int count = 0;
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

    // Method to split text into words without using split()
    String[] userDefinedSplit(String text) {

        int length=findLength(text);

        // Count number of words
        int wordCount=1;
        for (int i=0; i<length;i++) 
		{
            if (text.charAt(i)== ' ') 
			{
                wordCount++;
            }
        }

        // Store indexes of spaces
        int[] spaceIndex=new int[wordCount + 1];
        int idx= 0;
        spaceIndex[idx++]= -1;

        for (int i=0;i<length;i++) 
		{
            if (text.charAt(i)==' ') 
			{
                spaceIndex[idx++]=i;
            }
        }
        spaceIndex[idx]=length;

        // Extract words
        String[] words= new String[wordCount];
        for (int i=0;i<wordCount;i++) 
		{
            String word = "";
            for (int j=spaceIndex[i]+1; j<spaceIndex[i+1];j++) 
			{
                word= word+text.charAt(j);
            }
            words[i]= word;
        }

        return words;
    }

    // Method to return 2D array of word and its length
    String[][] wordLength2D(String[] words) 
	{

        String[][] result= new String[words.length][2];

        for (int i= 0; i<words.length;i++) 
		{
            int len=findLength(words[i]);
            result[i][0]= words[i];
            result[i][1]= String.valueOf(len);
        }

        return result;
    }

public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        WordLength2DArray obj= new WordLength2DArray();

        // taking user input
        System.out.println("Enter a sentence:");
        String text= sc.nextLine();

        // Spliting text into words
        String[] words= obj.userDefinedSplit(text);

        // Creating 2D array of words and lengths
        String[][] result=obj.wordLength2D(words);

        // Display in tabular format
        System.out.println("\nWord\tLength");
        System.out.println(" ");

        for (int i=0; i<result.length;i++) 
		{
            int length=Integer.parseInt(result[i][1]);
            System.out.println(result[i][0]+"\t" + length);
        }
     }
   }
