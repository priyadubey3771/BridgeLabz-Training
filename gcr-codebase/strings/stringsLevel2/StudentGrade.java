
public class StudentGrade{

    //method to generate random two digit PCM scores
    static int[][] generatePCMScores(int students) 
	{
        int[][] pcm= new int[students][3];

        for (int i=0;i<students;i++) 
		{
            pcm[i][0]=(int) (Math.random()*90)+ 10; 
            pcm[i][1]=(int) (Math.random()*90)+ 10; 
            pcm[i][2]=(int) (Math.random()*90)+ 10; 
        }
        return pcm;
    }

     //method to calculate total,average,percentage
    static double[][] calculateScores(int[][] pcm) 
	{
        double[][] result= new double[pcm.length][3];

        for (int i=0; i<pcm.length;i++) 
		{
            double total= pcm[i][0]+ pcm[i][1]+ pcm[i][2];
            double average= total/3;
            double percentage =(total/300)*100;

            result[i][0]= total;
            result[i][1]= Math.round(average*100.0)/100.0;
            result[i][2]= Math.round(percentage*100.0)/100.0;
        }
        return result;
    }

    //method to calculate grade based on percentage
    static String[] calculateGrade(double[][] scores) {
        String[] grades= new String[scores.length];

        for (int i=0;i<scores.length;i++) 
		{
            double p=scores[i][2];

            if (p>=80) 
			{
				grades[i]= "A";
            }
			else if (p>=70)
			{
				grades[i]= "B";
			}
            else if (p>=60) 
			{
				grades[i]= "C";
			}
			else if (p>= 50) 
			{
				grades[i]= "D";
			}
            else if (p>= 40) 
			{
				grades[i]= "E";
			}
            else 
			{
				grades[i]= "R";
			}
        }
        return grades;
    }

    //method to display scorecard
    static void displayScoreCard(int[][] pcm, double[][] scores, String[] grades)
	{

        System.out.println("Student\tPhy\tChem\tMath\tTotal\tAverage\tPercent\tGrade");
        System.out.println("\n");
		for (int i=0; i<pcm.length;i++) 
		{
            System.out.println((i+1) + "\t" +pcm[i][0] + "\t" +pcm[i][1] + "\t" +pcm[i][2] + "\t" +scores[i][0] + "\t" +
			scores[i][1] + "\t" +scores[i][2] + "\t" +grades[i]);
        }
    }

public static void main(String[] args) {

        int students= 5;
		int[][] pcm= generatePCMScores(students);
        double[][] scores= calculateScores(pcm);
        String[] grades=calculateGrade(scores);
		displayScoreCard(pcm,scores,grades);
     }
   }
