/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.behavioural.command;

/**
 *
 * @author bradley
 */
public class MainDriver {
    
    public static void main(String[] args) {
        Lunch lunch = new Lunch();
        Command lunchCommand = new LunchCommand(lunch); //concrete command
        
        Dinner dinner = new Dinner();
        Command dinnerCommand = new DinnerCommand(dinner); // concrete command
        
        MealInvoker mealInvoker = new MealInvoker(lunchCommand); //Invoker
        mealInvoker.invoke();
        
        mealInvoker.setCommand(dinnerCommand);
        mealInvoker.invoke();
    }
}
