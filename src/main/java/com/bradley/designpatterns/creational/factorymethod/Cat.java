/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.creational.factorymethod;

/**
 *
 * @author bradley
 */
public class Cat implements Animal{

    @Override
    public String makeSound() {
        return "Moew";
    }   
}
