
import java.util.Scanner;
public class CharacterTypeTable{

    // Method to check character type
    String checkCharacter(char ch) 
	{
		// Convert uppercase to lowercase using ASCII
        if (ch>='A' && ch<='Z') 
		{
            ch= (char)(ch + 32);
        }
		// Check if character is a letter
        if (ch>='a' && ch<='z') 
		{
			// Check vowels
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
	// Method to create 2D array of character and its type
    String[][] findCharacterTypes(String text) 
	{
		String[][] result = new String[text.length()][2];
		for (int i=0; i<text.length(); i++) 
		{
            char ch=text.charAt(i);
            result[i][0]= String.valueOf(ch);
            result[i][1]= checkCharacter(ch);
        }

        return result;
    }
	// Method to display 2D array in tabular format
    void displayTable(String[][] data) 
	{

        System.out.println("\nCharacter\tType");
        System.out.println(" ");
		for (int i=0; i<data.length;i++) 
		{
            System.out.println(data[i][0]+"\t\t"+data[i][1]);
        }
    }

public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
        CharacterTypeTable obj= new CharacterTypeTable();

        // taking user input
        System.out.println("Enter a string:");
        String input=sc.nextLine();

        //displaying the result
        String[][] result=obj.findCharacterTypes(input);
        obj.displayTable(result);
     }
   }
