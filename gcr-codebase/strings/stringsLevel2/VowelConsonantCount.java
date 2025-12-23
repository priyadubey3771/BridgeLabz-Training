
import java.util.Scanner;
public class VowelConsonantCount{

    // Method to check whether a character is vowel or consonant
    String checkCharacter(char ch) 
	{
		// Convert uppercase to lowercase using ASCII values
         if(ch>='A' && ch<='Z') 
		 {
            ch= (char)(ch+32);
        }

        // Check if character is a letter
        if (ch>= 'a' && ch<= 'z') 
		{
			// Check for vowels
            if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') 
			{
                return "Vowel";
            } 
			else 
			{
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to find vowels and consonants count in a string
    int[] findVowelsAndConsonants(String text) 
	{
		int vowelCount=0;
        int consonantCount=0;

        for(int i=0;i<text.length();i++) 
		{
			char ch=text.charAt(i);
            String result=checkCharacter(ch);
			if(result.equals("Vowel")) 
			{
                vowelCount++;
            } 
			else if(result.equals("Consonant")) 
			{
                consonantCount++;
            }
        }

        return new int[]{vowelCount, consonantCount};
    }

public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        VowelConsonantCount obj=new VowelConsonantCount();

        // User input
        System.out.println("Enter a string:");
        String input= sc.nextLine();
		// Get counts
        int[] result= obj.findVowelsAndConsonants(input);

        // Display result
        System.out.println("Number of Vowels: " + result[0]);
        System.out.println("Number of Consonants: " + result[1]);
     }
  }
