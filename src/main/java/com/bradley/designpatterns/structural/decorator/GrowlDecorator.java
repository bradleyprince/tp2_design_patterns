/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.structural.decorator;

/**
 *
 * @author bradley
 */
public class GrowlDecorator extends AnimalDecorator{
    
    public GrowlDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public void describe() {
        animal.describe();
        growl();
    }
    
    public void growl(){
        System.out.println("Grrrrr.");
    }
}
