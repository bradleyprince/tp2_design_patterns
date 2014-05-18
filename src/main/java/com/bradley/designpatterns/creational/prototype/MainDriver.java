/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.creational.prototype;

/**
 *
 * @author bradley
 */
public class MainDriver {
    public static void main(String[] args) {
        Person person1 = new Person("Fred");
        System.out.println("Person 1 :" + person1);
        Person person2 = (Person)person1.doClone();
        System.out.println("Person 2: " + person2);
        
        Dog dog1 = new Dog("Wooof!");
        System.out.println("dog 1: " + dog1);
        Dog dog2 = (Dog)dog1.doClone();
        System.out.println("Dog 2: " + dog2);
    }
}
