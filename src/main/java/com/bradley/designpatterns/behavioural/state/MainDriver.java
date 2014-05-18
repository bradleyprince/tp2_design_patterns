/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.behavioural.state;

/**
 *
 * @author bradley
 */
public class MainDriver {
    
    public static void main(String[] args) {
        Person person = new Person(new HappyState());
        System.out.println("Hello in happy state: " + person.sayHello());
        System.out.println("Goodbye in happy state: " + person.sayGoodbye());
        
        person = new Person(new SadState());
        System.out.println("Hello in sad state: " + person.sayHello());
        System.out.println("GoodBye in sad state: " + person.sayGoodbye());
    }
  
}
