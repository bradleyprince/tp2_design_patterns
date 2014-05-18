/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.structural.flyweight;

/**
 *
 * @author Balla
 */
public class FlywewightAdder implements Flyweight{
    String operation;

    public FlywewightAdder() {
        operation = "adding";
        
        try{
            Thread.sleep(3000);
        }catch(Exception e){
        
        }
    }
    
    @Override
    public void doMath(int a, int b) {
        System.out.println(operation + " " + a + " and " + b + ": " + (a + b));
    }
    
}
