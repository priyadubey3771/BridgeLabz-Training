package fittrack;

// Base Workout class
public abstract class Workout implements ITrackable {

    protected String type;
    protected int duration;
    protected int caloriesBurned;

    protected abstract void calculateCalories();

    public int getCaloriesBurned() 
    {
        return caloriesBurned;
    }

    @Override
    public void startWorkout() 
    {
        System.out.println(type + " workout started.");
    }

    @Override
    public void stopWorkout() 
    {
        System.out.println(type + " workout stopped.");
    }
}
