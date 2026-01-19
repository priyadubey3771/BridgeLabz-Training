package com.personalizedmealplangenerator;

//high protein meal plan
class HighProteinMeal implements MealPlan {

 @Override
 public String getMealType() 
 {
     return "High-Protein";
 }

 @Override
 public int getDailyCalories() 
 {
     return 2500;
 }
}
