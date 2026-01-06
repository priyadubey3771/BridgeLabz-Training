package edumentor;

 //Learner class extending User and implementing certification
public class Learner extends User implements ICertifiable {

    protected double progressPercentage;

    public Learner(int userId, String name, String email) 
    {
        super(userId, name, email);
    }

    public void setProgress(double progressPercentage) 
    {
        this.progressPercentage = progressPercentage;
    }

    //certificate generation
    @Override
    public void generateCertificate() 
    {
        System.out.println("Certificate generated for Full-Time Learner: " + name);
    }

    @Override
    public void printDetails() 
    {
        System.out.println("Learner ID: " + userId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Progress: " + progressPercentage + "%");
    }
}
