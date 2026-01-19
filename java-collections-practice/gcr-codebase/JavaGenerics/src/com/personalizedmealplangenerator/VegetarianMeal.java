package com.personalizedmealplangenerator;

//vegetarian meal plan
class VegetarianMeal implements MealPlan {

 @Override
 public String getMealType() 
 {
     return "Vegetarian";
 }

 @Override
 public int getDailyCalories() 
 {
     return 2000;
 }
}
