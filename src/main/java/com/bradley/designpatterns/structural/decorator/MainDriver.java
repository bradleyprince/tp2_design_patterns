/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.structural.decorator;

/**
 *
 * @author bradley
 */
public class MainDriver {
    public static void main(String[] args) {
        Animal animal = new LivingAnimal();
        animal.describe();
        
        animal = new LegDecorator(animal);
        animal.describe();
        
        animal = new WingDecorator(animal);
        animal.describe();
        
        animal = new GrowlDecorator(animal);
        animal.describe();
                
    }
}
