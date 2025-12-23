
import java.util.Scanner;
public class SplitTextComparison{

    // Method to find length without using length
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

    // Method to split text into words without using split
     String[] userDefinedSplit(String text) 
	 {
		int length = findLength(text);

        //Count number of words
        int wordCount=1;
        for (int i=0;i<length;i++) 
		{
            if (text.charAt(i)== ' ') 
			{
                wordCount++;
            }
        }
		//Store space indexes
        int[] spaceIndex= new int[wordCount+1];
        int index=0;
        spaceIndex[index++]=-1;

        for (int i=0;i<length;i++) 
		{
            if (text.charAt(i)==' ') 
			{
                spaceIndex[index++]= i;
            }
        }
        spaceIndex[index]=length;

        //Extract words using indexes
        String[] words= new String[wordCount];
        for (int i=0;i<wordCount;i++) 
		{
            String word= "";
            for (int j=spaceIndex[i]+1; j<spaceIndex[i+1];j++) 
			{
                word=word+text.charAt(j);
            }
            words[i]=word;
        }

        return words;
    }

    // Method to compare two string arrays
    boolean compareArrays(String[] arr1, String[] arr2) 
	{
		if (arr1.length!=arr2.length) 
		{
            return false;
        }

        for (int i=0;i<arr1.length;i++) 
		{
            if (!arr1[i].equals(arr2[i])) 
			{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        SplitTextComparison split = new SplitTextComparison();

        // Taking user input
        System.out.println("Enter a sentence:");
        String text=sc.nextLine();
		
		// User defined split
        String[] userWords=split.userDefinedSplit(text);
		// Built in split
        String[] builtInWords=text.split(" ");
		// Compare results
        boolean result = split.compareArrays(userWords,builtInWords);

        // Display result
        System.out.println("User defined split matches built in split: " +result);
     }
  }
