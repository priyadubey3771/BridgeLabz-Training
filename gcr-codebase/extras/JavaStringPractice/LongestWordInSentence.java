
import java.util.Scanner;
public class LongestWordInSentence{

    // Method to find the longest word in a sentence
    static String findLongestWord(String text)
    {
        String longestWord="";
        String currentWord="";
		for(int i=0;i<text.length();i++)
        {
            char ch=text.charAt(i);
			if(ch!=' ')
            {
                currentWord=currentWord+ch;
            }
            else
            {
                if(currentWord.length()>longestWord.length())
                {
                    longestWord=currentWord;
                }
                currentWord= "";
            }
        }

        // Check last word if no space at end
        if(currentWord.length()>longestWord.length())
        {
            longestWord=currentWord;
        }

        return longestWord;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter a sentence: ");
        String sentence=sc.nextLine();
		String longestWord=findLongestWord(sentence);
		System.out.println("Longest word in the sentence: "+longestWord);
     }
   }
