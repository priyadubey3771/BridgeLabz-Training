
import java.util.Scanner;
import java.util.Random;
public class StudentScoreCard{

    // Method to generate random PCM scores
       public int[][] generateScores(int students) 
	   {
			Random random=new Random();
			int[][] scores=new int[students][3];

			for (int i=0; i<students;i++) 
			{
				scores[i][0]=random.nextInt(90)+10;
				scores[i][1]=random.nextInt(90)+10; 
				scores[i][2]=random.nextInt(90)+10; 
			}
			return scores;
		}

    // Method to calculate total, average, percentage
         public double[][] calculateResults(int[][] scores) 
		{
			int students=scores.length;
			double[][] results= new double[students][3];

			for (int i=0;i<students;i++) 
			{
				double total= scores[i][0] +scores[i][1] +scores[i][2];
				double average= total/3;
				double percentage= (total/300)*100;

				results[i][0]= Math.round(total*100.0)/100.0;
				results[i][1]= Math.round(average*100.0)/100.0;
				results[i][2]= Math.round(percentage*100.0)/100.0;
			}
			return results;
		}

    // Method to display scorecard
    public void displayScoreCard(int[][] scores, double[][] results) 
	{
        System.out.println("\nID\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
			for (int i=0; i<scores.length;i++) 
			{
				System.out.println((i+1) + "\t" +scores[i][0] + "\t" +scores[i][1] + "\t\t" +scores[i][2] + "\t" +results[i][0] + "\t" +results[i][1] + "\t" +results[i][2]);
			}
    }

  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
		StudentScoreCard obj = new StudentScoreCard();
		int[][] scores = obj.generateScores(students);
        double[][] results = obj.calculateResults(scores);
        obj.displayScoreCard(scores, results);

        sc.close();
     }
   }
