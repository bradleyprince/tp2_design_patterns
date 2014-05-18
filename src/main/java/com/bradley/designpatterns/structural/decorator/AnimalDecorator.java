/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.structural.decorator;

/**
 *
 * @author bradley
 */
public abstract class AnimalDecorator implements Animal{
    Animal animal;

    public AnimalDecorator(Animal animal) {
        this.animal = animal;
    }
    
    
}
