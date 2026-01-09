package skillforge;

public class Student extends User implements ICertifiable {

	// Modules completed by student
    private int completedModules; 

    public Student(String name, String email) 
    {
        super(name, email);
        this.completedModules = 0;
    }

    // Update progress
    public void completeModule() 
    {
        completedModules++;
    }

    public int getCompletedModules() 
    {
        return completedModules;
    }

    @Override
    public void generateCertificate() 
    {
        System.out.println("Certificate generated for student: " + name);
    }
}
