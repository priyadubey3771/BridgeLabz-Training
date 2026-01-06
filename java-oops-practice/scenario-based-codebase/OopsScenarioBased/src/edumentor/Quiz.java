package edumentor;

public class Quiz {

    // Internal question bank is private
    private String[] questions;
    // Answers are immutable
    private final int[] correctAnswers;
    private int score;

    // Constructor
    public Quiz(String[] questions, int[] correctAnswers) 
    {
        this.questions = questions;
        this.correctAnswers = correctAnswers;
    }

    // Calculating score
    public void submitQuiz(int[] userAnswers) 
    {
        score = 0;
        for (int i = 0; i < correctAnswers.length; i++) 
        {
            if (userAnswers[i] == correctAnswers[i])
            {
                score++;
            }
        }
    }

    // Generating percentage
    public double getPercentage() 
    {
        return (double) score / questions.length * 100;
    }

    public int getScore() 
    {
        return score;
    }
}
