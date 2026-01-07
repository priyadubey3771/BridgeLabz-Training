package fittrack;

//Cardio workout 
public class CardioWorkout extends Workout 
{

    public CardioWorkout(int duration) 
    {
        this.type = "Cardio";
        this.duration = duration;
        calculateCalories();
    }

    //calorie calculation
    @Override
    protected void calculateCalories() 
    {
        caloriesBurned = duration * 10;
    }
}
