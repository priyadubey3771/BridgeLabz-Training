
import java.util.Scanner;
public class ShortestLongestWord{

    // Method to find string length without using length
    int findLength(String text) 
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

    // Method to split text into words without using split()
    String[] userDefinedSplit(String text) 
	{
		int length = findLength(text);

        // Count words
        int wordCount=1;
        for (int i=0; i<length;i++) 
		{
            if (text.charAt(i)== ' ') 
			{
                wordCount++;
            }
        }

        // Store space indexes
        int[] spaceIndex= new int[wordCount+1];
        int idx = 0;
        spaceIndex[idx++]= -1;

        for (int i=0;i<length;i++) 
		{
            if (text.charAt(i)== ' ') 
			{
                spaceIndex[idx++]= i;
            }
        }
        spaceIndex[idx]= length;

        // Extracting words
        String[] words= new String[wordCount];
        for (int i=0; i<wordCount;i++) 
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

    // Method to create 2D array of word and its length
    String[][] wordLength2D(String[] words)
	{
		String[][] result = new String[words.length][2];
		for (int i=0; i<words.length;i++) 
		{
            int len=findLength(words[i]);
            result[i][0]= words[i];
            result[i][1]= String.valueOf(len);
        }

        return result;
    }

    // Method to find shortest and longest word
    int[] findShortestAndLongest(String[][] data) 
	{

        int minIndex= 0;
        int maxIndex= 0;

        for (int i=1; i<data.length;i++) 
		{
            int currentLength= Integer.parseInt(data[i][1]);
            int minLength= Integer.parseInt(data[minIndex][1]);
            int maxLength= Integer.parseInt(data[maxIndex][1]);

            if (currentLength<minLength) 
			{
                minIndex= i;
            }
            if (currentLength>maxLength) 
			{
                maxIndex= i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ShortestLongestWord obj= new ShortestLongestWord();

        // taking user input
        System.out.println("Enter a sentence:");
        String text= sc.nextLine();
		// Spliting text into words
        String[] words = obj.userDefinedSplit(text);

        // Create 2D array of word and length
        String[][] wordData=obj.wordLength2D(words);

        // Finding shortest and longest
         int[] result= obj.findShortestAndLongest(wordData);

        // Displaying result
        System.out.println("\nShortest word: " + wordData[result[0]][0] + " (Length: " + Integer.parseInt(wordData[result[0]][1]) + ")");
		System.out.println("Longest word: " + wordData[result[1]][0] + " (Length: " + Integer.parseInt(wordData[result[1]][1]) + ")");
     }
   }
