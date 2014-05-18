/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.creational.builder;

/**
 *
 * @author bradley
 */
public class MainDriver {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new ItalianMealBuilder();
        MealDirector mealDirector = new MealDirector(mealBuilder);
        mealDirector.constructMeal();
        Meal meal = mealDirector.getMeal();
        System.out.println("meal is: " + meal.toString());
        
        mealBuilder = new JapaneseMealBuilder();
        mealDirector = new MealDirector(mealBuilder);
        mealDirector.constructMeal();
        meal = mealBuilder.getMeal();
        System.out.println("meal is: " + meal.toString());
        
        mealBuilder = new MexicanMealBuilder();
        mealDirector = new MealDirector(mealBuilder);
        mealDirector.constructMeal();
        meal = mealBuilder.getMeal();
        System.out.println("meal is: " + meal.toString());
        
        mealBuilder = new SouthAfricanMealBuilder();
        mealDirector = new MealDirector(mealBuilder);
        mealDirector.constructMeal();
        meal = mealBuilder.getMeal();
        System.out.println("meal is: " + meal.toString());
    }
}
