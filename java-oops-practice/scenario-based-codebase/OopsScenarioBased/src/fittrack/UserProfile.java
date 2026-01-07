package fittrack;

//Represents user profile in FitTrack app
public class UserProfile {

    private String name;
    private int age;

    // Health data should be private
    private double weight;
    private int dailyCalorieGoal;

    // Constructor with default goal
    public UserProfile(String name, int age, double weight) 
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dailyCalorieGoal = 2000;
    }

    // Constructor with custom goal
    public UserProfile(String name, int age, double weight, int dailyCalorieGoal) 
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dailyCalorieGoal = dailyCalorieGoal;
    }

    // Getter only
    public double getWeight() 
    {
        return weight;
    }

    public int getDailyCalorieGoal() 
    {
        return dailyCalorieGoal;
    }

    public void displayProfile() 
    {
        System.out.println("User: " + name);
        System.out.println("Age: " + age);
        System.out.println("Daily Calorie Goal: " + dailyCalorieGoal);
    }
}
