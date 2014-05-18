/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.creational.abstractfactory;

import com.bradley.designpatterns.creational.factorymethod.Animal;
import com.bradley.designpatterns.creational.factorymethod.Cat;
import com.bradley.designpatterns.creational.factorymethod.Dog;

/**
 *
 * @author bradley
 */
public class MammalFactory implements SpeciesFactory{

    @Override
    public Animal getAnimal(String type) {
        if (type.equals("dog"))
            return new Dog();
        else
            return new Cat();
    }
    
}
