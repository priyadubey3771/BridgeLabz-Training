package fittrack;

public class FitTrackDriver {
  public static void main(String[] args) {

        // User creation
        UserProfile user = new UserProfile("Priya", 22, 55.5, 1800);
        user.displayProfile();

        System.out.println(" ");

        // Workouts
        Workout cardio = new CardioWorkout(30);
        Workout strength = new StrengthWorkout(40);

        cardio.startWorkout();
        cardio.stopWorkout();
        strength.startWorkout();
        strength.stopWorkout();

        int totalCaloriesBurned = cardio.getCaloriesBurned() + strength.getCaloriesBurned();
        int remainingCalories = user.getDailyCalorieGoal() - totalCaloriesBurned;

        System.out.println("----------------------");
        System.out.println("Calories Burned: " + totalCaloriesBurned);
        System.out.println("Remaining Calories: " + remainingCalories);
    }
}
