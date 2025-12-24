
import java.util.Scanner;
public class FirstNonRepeatingCharacter{

    // Method to find the first non-repeating character
    static char findFirstNonRepeatingCharacter(String text)
    {
        int[] frequency = new int[256];
		//counting frequency of each character
        for(int i=0;i<text.length();i++)
        {
            char ch=text.charAt(i);
            frequency[ch]++;
        }
		//finding first character with frequency 1
        for(int i=0;i<text.length();i++)
        {
            char ch=text.charAt(i);
            if(frequency[ch]==1)
            {
                return ch;
            }
        }

        return '\0';
    }

public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input=sc.next();
		char result=findFirstNonRepeatingCharacter(input);
		if(result!='\0')
        {
            System.out.println("First non-repeating character: " + result);
        }
        else
        {
            System.out.println("No non-repeating character found");
        }
    }
}
