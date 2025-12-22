
import java.util.Scanner;
public class NumberChecker2{

    //Method to find count of digits
    public static int countDigits(int number)
    {
        int count=0;
        while(number!=0)
        {
            count++;
            number/=10;
        }
        return count;
    }
    //Method to store digits of number in array
    public static int[] storeDigits(int number)
    {
        int count=countDigits(number);
        int[] digits=new int[count];
        int index=count-1;

        while(number!=0)
        {
            digits[index]=number%10;
            number/=10;
            index--;
        }
        return digits;
    }
	//Method to reverse digits array
    public static int[] reverseArray(int[] digits)
    {
        int[] reverse=new int[digits.length];
        for(int i=0;i<digits.length;i++)
        {
            reverse[i]=digits[digits.length-1-i];
        }
        return reverse;
    }
	//Method to compare two arrays
    public static boolean compareArrays(int[] a,int[] b)
    {
        if(a.length!=b.length)
        {
            return false;
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=b[i])
            {
                return false;
            }
        }
        return true;
    }
	//Method to check Palindrome Number
    public static boolean isPalindrome(int[] digits)
    {
        int[] reverse=reverseArray(digits);
        return compareArrays(digits,reverse);
    }
	//Method to check Duck Number
    public static boolean isDuckNumber(int[] digits)
    {
        for(int i=0;i<digits.length;i++)
        {
            if(digits[i]==0)
            {
                return true;
            }
        }
        return false;
    }

 public static void main(String[] args){
        //Taking user input
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number:");
        int number=input.nextInt();

        //Storing digits
        int[] digits=storeDigits(number);

        //Displaying digit count
        System.out.println("Digit Count:"+digits.length);

        //Reversing digits array
        int[] reverse=reverseArray(digits);
        System.out.print("Reversed Digits:");
        for(int i=0;i<reverse.length;i++)
        {
            System.out.print(reverse[i]+" ");
        }
        System.out.println();

        //Comparing original and reversed array
        if(compareArrays(digits,reverse))
        {
            System.out.println("Arrays are Equal");
        }
        else
        {
            System.out.println("Arrays are Not Equal");
        }

        //Checking Palindrome
        if(isPalindrome(digits))
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not a Palindrome Number");
        }

        //Checking Duck Number
        if(isDuckNumber(digits))
        {
            System.out.println("Duck Number");
        }
        else
        {
            System.out.println("Not a Duck Number");
        }

        input.close();
     }
    }
