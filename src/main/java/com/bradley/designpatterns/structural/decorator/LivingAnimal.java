/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.structural.decorator;

/**
 *
 * @author bradley
 */
public class LivingAnimal implements Animal{

    @Override
    public void describe() {
            System.out.println("\nI am an animal.");
    }
    
}
