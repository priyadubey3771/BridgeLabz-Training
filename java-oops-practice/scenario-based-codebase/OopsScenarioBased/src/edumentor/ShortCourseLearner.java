package edumentor;

//ShortCourseLearner overrides certificate logic
public class ShortCourseLearner extends Learner {

    public ShortCourseLearner(int userId, String name, String email) 
    {
        super(userId, name, email);
    }

    // Different certificate behavior
    @Override
    public void generateCertificate() 
    {
        System.out.println("Certificate generated for Short Course Learner: " + name);
    }
}
