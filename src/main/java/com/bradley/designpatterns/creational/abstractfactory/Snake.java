/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.creational.abstractfactory;

import com.bradley.designpatterns.creational.factorymethod.Animal;

/**
 *
 * @author bradley
 */
public class Snake implements Animal{
    
    @Override
    public String makeSound() {
        return "Hiss";
    }
    
}
