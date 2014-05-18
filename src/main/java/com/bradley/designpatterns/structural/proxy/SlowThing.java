/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.structural.proxy;

/**
 *
 * @author bradley
 */
public class SlowThing extends Thing{

    public SlowThing() {
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
}
