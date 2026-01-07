package fittrack;

// Strength workout burns moderate calories
public class StrengthWorkout extends Workout {

    public StrengthWorkout(int duration) 
    {
        this.type = "Strength";
        this.duration = duration;
        calculateCalories();
    }

    // Different calorie logic
    @Override
    protected void calculateCalories() 
    {
        caloriesBurned = duration * 7;
    }
}
