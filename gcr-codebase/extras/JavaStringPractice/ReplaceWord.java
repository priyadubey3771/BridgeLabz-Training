
import java.util.Scanner;
public class ReplaceWord{

    // Method to replace a given word with another word in a sentence
    static String replaceWord(String sentence,String oldWord,String newWord)
    {
        String result= "";
        int i=0;
		while(i<sentence.length())
        {
            int j=i;
            String word= "";

            // get a word using charAt()
            while(j<sentence.length() && sentence.charAt(j)!=' ')
            {
                word=word+sentence.charAt(j);
                j++;
            }
			// Replace if word matches oldWord
            if(word.equals(oldWord))
            {
                result=result+newWord;
            }
            else
            {
                result=result+word;
            }
			// Add space if present
            if(j<sentence.length())
            {
                result=result+ " ";
            }
			i=j+1;
        }
		return result;
     }
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence=sc.nextLine();
		System.out.print("Enter word to replace: ");
        String oldWord=sc.next();
		System.out.print("Enter new word: ");
        String newWord=sc.next();
		String updatedSentence=replaceWord(sentence, oldWord, newWord);
		System.out.println("Updated Sentence:");
        System.out.println(updatedSentence);
     }
  }
