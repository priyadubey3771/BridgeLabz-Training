
import java.util.Scanner;
public class RemoveSpecificCharacter{

    // Method to remove all occurrences of specific character
    static String removeCharacter(String text,char removeChar)
    {
        String result="";

        for(int i=0; i<text.length(); i++)
        {
            if(text.charAt(i)!=removeChar)
            {
                result= result+text.charAt(i);
            }
        }
        return result;
    }
public static void main(String[] args){
   Scanner sc= new Scanner(System.in);

        System.out.print("Enter the string: ");
        String text=sc.nextLine();
		System.out.print("Enter character to remove: ");
        char removeChar= sc.next().charAt(0);
		String modifiedString = removeCharacter(text, removeChar);
		System.out.println("Modified String: \"" + modifiedString + "\"");
     }
   }
