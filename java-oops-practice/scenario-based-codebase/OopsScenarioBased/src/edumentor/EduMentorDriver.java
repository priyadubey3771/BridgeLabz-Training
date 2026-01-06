package edumentor;

public class EduMentorDriver {
  public static void main(String[] args) {

        // Instructor
        Instructor instructor = new Instructor( 1, "Dr. Rao", "rao@edumentor.com", "AI & ML");

        // Learners
        Learner fullTimeLearner = new Learner(101, "Amit", "amit@student.com" );
        Learner shortCourseLearner = new ShortCourseLearner( 102, "Neha", "neha@student.com");

        // Quiz creation
        String[] questions = { "What is Java?", "What is OOPS?", "What is Polymorphism?"};

        int[] correctAnswers = {1, 2, 3};
        Quiz quiz = new Quiz(questions, correctAnswers);
        int[] userAnswers = {1, 2, 2};
        quiz.submitQuiz(userAnswers);
        double percentage = quiz.getPercentage();

        fullTimeLearner.setProgress(percentage);
        shortCourseLearner.setProgress(percentage);

        // Polymorphism
        User[] users = {fullTimeLearner, shortCourseLearner, instructor};

        for (User user : users) 
        {
            user.printDetails();
            System.out.println("--------------------");
        }

        // Certificate generation
        fullTimeLearner.generateCertificate();
        shortCourseLearner.generateCertificate();

        System.out.println("Quiz Score: " + quiz.getScore());
        System.out.println("Percentage: " + percentage + "%");
    }
}
