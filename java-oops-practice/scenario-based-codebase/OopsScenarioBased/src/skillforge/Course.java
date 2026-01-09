package skillforge;

//Represents a course on SkillForge
public class Course {

    private String title;        
    private Instructor instructor; 
    private double rating;       
    private String[] modules;    
    private String level;        

    //Constructor with default modules
    public Course(String title, Instructor instructor, String level) 
    {
        this(title, instructor, level,new String[]{"Introduction", "Core Concepts", "Final Assessment"});
    }

    //Constructor with custom module list
    public Course(String title, Instructor instructor, String level, String[] modules) 
    {
        this.title = title;
        this.instructor = instructor;
        this.level = level;
        this.modules = modules;
        this.rating = 0.0;
    }

    //Protected rating logic
    protected void updateRating(int stars) 
    {
        if (stars >= 1 && stars <= 5) 
        {
            rating = (rating + stars) / 2; 
        }
    }

    // Read-only access to rating
    public double getRating() 
    {
        return rating;
    }

    public String getTitle() 
    {
        return title;
    }

    public int getTotalModules() 
    {
        return modules.length;
    }

    public String getLevel() 
    {
        return level;
    }
}
