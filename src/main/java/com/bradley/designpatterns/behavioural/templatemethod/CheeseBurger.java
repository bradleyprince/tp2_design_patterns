/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.behavioural.templatemethod;

/**
 *
 * @author bradley
 */
public class CheeseBurger extends Meal{
    
    @Override
    public void prepareIngredients() {
        System.out.println("Getting ground beef and Cheese");
    }

    @Override
    public void cook() {
        System.out.println("Cooking ground beef in pan");
    }

    @Override
    public void eat() {
        System.out.println("The Cheese Burgers are tasty!!!");
    }
   
    @Override
    public void cleanUp() {
        System.out.println("Doing the dishes");
    }
}
