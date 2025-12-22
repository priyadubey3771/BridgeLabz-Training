
import java.util.Random;
public class FootballTeamHeights{

    //Method to find sum of heights
    int findSum(int[] heights)
    {
        int sum=0;
        for(int i=0; i<heights.length;i++)
        {
            sum= sum +heights[i];
        }
        return sum;
    }
    //Method to find mean height
    double findMean(int[] heights)
    {
        return (double)findSum(heights)/heights.length;
    }
	//Method to find shortest height
    int findShortest(int[] heights)
    {
        int min= heights[0];
        for(int i=1;i<heights.length; i++)
        {
            if(heights[i]< min)
            {
                min= heights[i];
            }
        }
        return min;
    }
	//Method to find tallest height
    int findTallest(int[] heights)
    {
        int max= heights[0];
        for(int i=1;i<heights.length;i++)
        {
            if(heights[i]>max)
            {
                max=heights[i];
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        //Creating array to store heights
        int[] heights=new int[11];
        Random random=new Random();
		//creating random heights between 150 and 250
        for(int i=0;i<heights.length;i++)
        {
            heights[i]=random.nextInt(101)+150;
        }

        FootballTeamHeights football =new FootballTeamHeights();
		int shortest=football.findShortest(heights);
        int tallest=football.findTallest(heights);
        double mean=football.findMean(heights);

        //Displaying player heights
        System.out.println("Player Heights:");
        for(int i=0;i<heights.length;i++)
        {
            System.out.print(heights[i]+" ");
        }

        //Displaying results
        System.out.println("\nShortest Height:"+shortest+" cms");
        System.out.println("Tallest Height:"+tallest+" cms");
        System.out.println("Mean Height:"+mean+" cms");
    }
  }
