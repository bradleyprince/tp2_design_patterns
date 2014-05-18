/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.structural.proxy;

import java.util.Date;

/**
 *
 * @author bradley
 */
public abstract class Thing {
    
    public void sayHello(){
        System.out.println(this.getClass().getSimpleName() + " says howdy at " + new Date());
    }
}
