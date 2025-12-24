
import java.util.Scanner;
public class ToggleCase{

    // Method to toggle the case of each character
    static String toggleCase(String text)
    {
        String result= "";
		for(int i=0;i<text.length();i++)
        {
            char ch=text.charAt(i);
			// Check for uppercase letters using ASCII values
            if(ch>='A' && ch<='Z')
            {
                result=result+(char)(ch+32);
            }
            // Check for lowercase letters using ASCII values
            else if(ch>='a' && ch<='z')
            {
                result=result+(char)(ch-32);
            }
            // If not a letter, keep it as it is
            else
            {
                result=result+ch;
            }
        }
		return result;
    }
public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text=sc.nextLine();
		String toggledText=toggleCase(text);
		System.out.println("Toggled Case String: "+toggledText);
     }
    }
