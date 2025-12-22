
import java.util.Scanner;
public class NumberChecker1{
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
	//Method to find sum of digits
    public static int sumOfDigits(int[] digits)
    {
        int sum=0;
        for(int i=0;i<digits.length;i++)
        {
            sum+=digits[i];
        }
        return sum;
    }
	//Method to find sum of squares of digits
    public static int sumOfSquares(int[] digits)
    {
        int sum=0;
        for(int i=0;i<digits.length;i++)
        {
            sum+=Math.pow(digits[i],2);
        }
        return sum;
    }
	//Method to check Harshad Number
    public static boolean isHarshadNumber(int number,int[] digits)
    {
        int sum= sumOfDigits(digits);
        return number%sum==0;
    }
	//Method to find frequency of each digit
    public static int[][] digitFrequency(int[] digits)
    {
        int[][] freq=new int[10][2];
		for(int i=0;i<10;i++)
        {
            freq[i][0]=i;
            freq[i][1]=0;
        }
		for(int i=0;i<digits.length;i++)
        {
            freq[digits[i]][1]++;
        }
        return freq;
    }
 public static void main(String[] args){
        //Taking user input
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number:");
        int number=input.nextInt();
		
		//Storing digits in array
        int[] digits=storeDigits(number);
		
		//Displaying digit count
        System.out.println("Digit Count:"+digits.length);
		
		//Displaying sum of digits
        System.out.println("Sum of Digits:"+sumOfDigits(digits));
		
		//Displaying sum of squares of digits
        System.out.println("Sum of Squares of Digits:"+sumOfSquares(digits));
		
		//Checking Harshad Number
        if(isHarshadNumber(number,digits))
        {
            System.out.println("Harshad Number");
        }
        else
        {
            System.out.println("Not a Harshad Number");
        }

        //Finding frequency of digits
        int[][] frequency=digitFrequency(digits);
        System.out.println("Digit Frequency:");
        for(int i=0;i<10;i++)
        {
            if(frequency[i][1]>0)
            {
                System.out.println("Digit "+frequency[i][0]+" occurs "+frequency[i][1]+" times");
            }
        }

        input.close();
    }
}
