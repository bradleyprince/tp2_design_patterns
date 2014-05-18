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
public class ReptileFactory implements SpeciesFactory{

    @Override
    public Animal getAnimal(String type) {
        if (type.equals("snake"))
            return new Snake();
        else
            return new Tyrannosaurus();
    }
    
}
