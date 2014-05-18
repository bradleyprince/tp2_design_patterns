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
public interface SpeciesFactory {
    public Animal getAnimal(String type);
}
