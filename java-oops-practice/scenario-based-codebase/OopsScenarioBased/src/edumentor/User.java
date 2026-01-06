package edumentor;

public abstract class User {

    protected int userId;
    protected String name;
    protected String email;

    // Constructor
    public User(int userId, String name, String email)
    {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    public abstract void printDetails();
}
