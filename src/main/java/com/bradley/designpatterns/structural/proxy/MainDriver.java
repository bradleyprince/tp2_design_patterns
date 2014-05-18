/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.structural.proxy;

/**
 *
 * @author bradley
 */
public class MainDriver {
    
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        FastThing fastThing = new FastThing();
        fastThing.sayHello();       
   }
}
