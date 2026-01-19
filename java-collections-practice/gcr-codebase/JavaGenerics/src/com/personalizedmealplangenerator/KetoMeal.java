package com.personalizedmealplangenerator;

//Keto meal plan
class KetoMeal implements MealPlan {

 @Override
 public String getMealType() 
 {
     return "Keto";
 }

 @Override
 public int getDailyCalories() 
 {
     return 2200;
 }
}
