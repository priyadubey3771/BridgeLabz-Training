
import java.util.Scanner;
public class MostFrequentCharacter{

    // Method to find the most frequent character in a string
    static char findMostFrequentCharacter(String text)
    {
        int[] frequency= new int[256];
		for(int i=0; i<text.length(); i++)
        {
            char ch= text.charAt(i);
            frequency[ch]++;
        }
		int maxCount= 0;
        char result= '\0';
		for(int i=0; i<text.length(); i++)
        {
            char ch= text.charAt(i);
			if(frequency[ch]>maxCount)
            {
                maxCount= frequency[ch];
                result= ch;
            }
        }
        return result;
    }
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);

        // taking string as input from the user
        System.out.print("Enter the string: ");
        String text= sc.nextLine();
		// displaying the result
		char mostFrequent= findMostFrequentCharacter(text);
		System.out.println("Most Frequent Character: '" +mostFrequent+"'");
     }
   }
