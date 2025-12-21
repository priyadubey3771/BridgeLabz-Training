
import java.util.Scanner;
public class YoungestAndTallest{

    // method to find the youngest of the three friends
    public String findYoungest(int[] ages,String[] names) 
	{
        int minAge= ages[0];
        int index= 0;

        for (int i=1; i<ages.length; i++) 
		{
            if (ages[i]< minAge) 
			{
                minAge= ages[i];
                index= i;
            }
        }
        return names[index];
    }

     // method to find the tallest of the three friends
    public String findTallest(double[] heights,String[] names)
	{
        double maxHeight= heights[0];
        int index=0;

        for (int i= 1; i<heights.length;i++) 
		{
            if (heights[i]> maxHeight) 
			{
                maxHeight=heights[i];
                index=i;
            }
        }
        return names[index];
    }

 public static void main(String[] args) {
   Scanner input = new Scanner(System.in);

        String[] names = {"Amar","Akbar","Anthony"};
        int[] ages =new int[3];
        double[] heights =new double[3];

        // taking the height and age of three friends as the input
        for (int i= 0; i< 3; i++) 
		{
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] =input.nextInt();
			System.out.print("Enter height of " + names[i] + ": ");
            heights[i]= input.nextDouble();
        }

        // calculating who is the tallest and youngest and displaying the result
        YoungestAndTallest friend = new YoungestAndTallest();
		String youngest= friend.findYoungest(ages,names);
        String tallest= friend.findTallest(heights,names);
		System.out.println("Youngest friend is: " + youngest);
        System.out.println("\nTallest friend is:" +tallest);

        input.close();
     }
   }
