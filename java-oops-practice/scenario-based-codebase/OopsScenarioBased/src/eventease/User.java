package eventease;

public class User {

    private String name;
    private String email;

    public User(String name, String email) 
    {
        this.name = name;
        this.email = email;
    }
    public String getName() 
    {
        return name;
    }

    // Email is protected using encapsulation
    public String getEmail() 
    {
        return email;
    }
}
