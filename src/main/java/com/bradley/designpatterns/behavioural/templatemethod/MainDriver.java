/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.behavioural.templatemethod;

/**
 *
 * @author bradley
 */
public class MainDriver {
    
    public static void main(String[] args) {
        Meal meal = new Hamburger();
        meal.doMeal();
        
        System.out.println();
        Meal meal2 = new CheeseBurger();
        meal2.doMeal();
    }
}
