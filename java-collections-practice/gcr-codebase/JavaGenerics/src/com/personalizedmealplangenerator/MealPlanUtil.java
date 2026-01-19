package com.personalizedmealplangenerator;

//utility class for meal generation
class MealPlanUtil {

 // generic method to validate and generate meal plan
 public static <T extends MealPlan> Meal<T> generateMealPlan(T plan) {

     if (plan.getDailyCalories() <= 0) 
     {
         throw new IllegalArgumentException("Invalid calorie value");
     }

     // display meal plan details
     System.out.println( "Generating " + plan.getMealType() + " Meal Plan | Calories: " + plan.getDailyCalories());

     return new Meal<>(plan);
     
 }
}
