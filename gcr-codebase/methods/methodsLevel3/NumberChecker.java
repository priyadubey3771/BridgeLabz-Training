
import java.util.Scanner;
public class NumberChecker{

    //Method to find count of digits
    public static int countDigits(int number)
    {
        int count=0;
        while(number!=0)
        {
            count++;
            number= number/10;
        }
        return count;
    }
	//Method to store digits of number in array
    public static int[] storeDigits(int number)
    {
        int count= countDigits(number);
        int[] digits= new int[count];
        int index= count-1;
		while(number!=0)
        {
            digits[index]=number%10;
            number= number/10;
            index--;
        }
        return digits;
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
	//Method to check Armstrong Number
    public static boolean isArmstrong(int number,int[] digits)
    {
        int sum=0;
        int power=digits.length;
		for(int i=0;i<digits.length; i++)
        {
            sum= sum+ (int)Math.pow(digits[i],power);
        }
        return sum==number;
    }
	//Method to find largest and second largest
    public static void findLargestSecondLargest(int[] digits)
    {
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
		for(int i=0; i<digits.length;i++)
        {
            if(digits[i]>largest)
            {
                secondLargest=largest;
                largest=digits[i];
            }
            else if(digits[i]>secondLargest&&digits[i]!=largest)
            {
                secondLargest=digits[i];
            }
        }
		System.out.println("Largest Digit:"+ largest);
        System.out.println("Second Largest Digit:"+ secondLargest);
    }
	//Method to find smallest and second smallest
    public static void findSmallestSecondSmallest(int[] digits)
    {
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;

        for(int i=0;i <digits.length;i++)
        {
            if(digits[i]<smallest)
            {
                secondSmallest=smallest;
                smallest= digits[i];
            }
            else if(digits[i]<secondSmallest&&digits[i]!=smallest)
            {
                secondSmallest=digits[i];
            }
        }

        System.out.println("Smallest Digit:"+ smallest);
        System.out.println("Second Smallest Digit:"+ secondSmallest);
    }

    public static void main(String[] args){
        //Taking user input
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number:");
        int number= input.nextInt();
		//Storing digits
        int[] digits=storeDigits(number);

        //Displaying digit count
        System.out.println("Digit Count:"+digits.length);
		//Checking Duck Number
        if(isDuckNumber(digits))
        {
            System.out.println("Duck Number");
        }
        else
        {
            System.out.println("Not a Duck Number");
        }

        //Checking Armstrong Number
        if(isArmstrong(number,digits))
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not an Armstrong Number");
        }

        //Finding largest and second largest
        findLargestSecondLargest(digits);

        //Finding smallest and second smallest
        findSmallestSecondSmallest(digits);

        input.close();
     }
   }
