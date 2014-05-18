/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.structural.bridge;

/**
 *
 * @author Balla
 */
public class SmallEngine implements Engine{
    int horsepower;

    public SmallEngine() {
        horsepower = 100;
    }
    
    @Override
    public int go() {
        System.out.println("The small engine is running!");
        return horsepower;
    }
}
