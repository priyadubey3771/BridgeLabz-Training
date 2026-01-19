package com.generics.personalizedmealplangenerator;

public class Driver {
  public static void main(String[] args) {

     // creating different meal plans
     VegetarianMeal vegetarian = new VegetarianMeal();
     VeganMeal vegan = new VeganMeal();
     KetoMeal keto = new KetoMeal();
     HighProteinMeal highProtein = new HighProteinMeal();

     // generating personalized meal plans
     Meal<VegetarianMeal> vegMeal = MealPlanUtil.generateMealPlan(vegetarian);
     Meal<VeganMeal> veganMeal = MealPlanUtil.generateMealPlan(vegan);
     Meal<KetoMeal> ketoMeal = MealPlanUtil.generateMealPlan(keto);
     Meal<HighProteinMeal> proteinMeal = MealPlanUtil.generateMealPlan(highProtein);
     
 }
}
