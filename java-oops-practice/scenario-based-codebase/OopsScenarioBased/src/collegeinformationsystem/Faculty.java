package collegeinformationsystem;

public class Faculty extends Person {

    // Department of the faculty member
    private String department;

    //Constructor to initialize faculty details
     
    public Faculty(int id, String name, String email, String department) 
    {
        super(id, name, email);
        this.department = department;
    }

    //method implementation for Faculty
     
    @Override
    public void printDetails()
    {
        System.out.println("Faculty ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Department: " + department);
    }
}
