/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.creational.abstractfactory;

/**
 *
 * @author bradley
 */
public class AbstractFactory {
    public AbstractFactory getAbstractFactoryInstance()
    {
        return new AbstractFactory();
    }
    
    public SpeciesFactory getSpeciesFactory(String type)
    {
        if (type.equals("mammal"))
            return new MammalFactory();
        else
            return new ReptileFactory();  
    }
}
