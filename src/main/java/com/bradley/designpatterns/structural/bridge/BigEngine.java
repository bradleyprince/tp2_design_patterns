/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.structural.bridge;

/**
 *
 * @author Balla
 */
public class BigEngine implements Engine{
    int horsepower;

    public BigEngine() {
        horsepower = 350;
    }
    
    @Override
    public int go() {
        System.out.println("The big engine is running!");
        return horsepower;
    }
    
}
