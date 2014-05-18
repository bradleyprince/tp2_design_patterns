/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.structural.flyweight;

/**
 *
 * @author bradley
 */
public class MainDriver {
    
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = FlyweightFactory.getinstance();
        
        for (int i = 0; i < 5; i++){
            Flyweight flyweightAdder = flyweightFactory.getFlyweight("add");
            flyweightAdder.doMath(i, i);
            
            Flyweight flyweightMultiplieer = flyweightFactory.getFlyweight("multiply");
            flyweightMultiplieer.doMath(i, i);
        }
    }
   
}
