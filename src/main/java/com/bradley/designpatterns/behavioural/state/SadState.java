/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.behavioural.state;

/**
 *
 * @author bradley
 */
public class SadState implements EmotionalState{

    @Override
    public String sayHello() {
        return "Hello, Sniff, sniff";       
    }

    @Override
    public String sayGoodbye() {
        return "Bye, Sniff, sniff!";  
    }
    
}
