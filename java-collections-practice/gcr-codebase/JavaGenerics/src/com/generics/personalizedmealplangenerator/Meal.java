package com.generics.personalizedmealplangenerator;

//generic Meal class
class Meal<T extends MealPlan> {

	 // holds the meal plan
	 private T mealPlan;
	
	 // constructor 
	 public Meal(T mealPlan) 
	 {
	     this.mealPlan = mealPlan;
	 }
	
	 // getter for meal plan
	 public T getMealPlan() 
	 {
	     return mealPlan;
	 }
 
}
