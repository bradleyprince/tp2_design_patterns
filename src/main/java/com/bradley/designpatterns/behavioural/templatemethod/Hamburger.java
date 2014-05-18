/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.behavioural.templatemethod;

/**
 *
 * @author bradley
 */
public class Hamburger extends Meal{

    @Override
    public void prepareIngredients() {
        System.out.println("Getting, burgers, bun and french fries");
    }

    @Override
    public void cook() {
        System.out.println("Cooking burgers on the grill and fries in oven");
    }

    @Override
    public void cleanUp() {
        System.out.println("Throwing away paper plates");
    }
    
}
