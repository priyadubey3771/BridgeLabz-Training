package com.generics.personalizedmealplangenerator;

//vegan meal plan
class VeganMeal implements MealPlan {

 @Override
 public String getMealType() 
 {
     return "Vegan";
 }

 @Override
 public int getDailyCalories() 
 {
     return 1800;
 }
}
