/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.creational.singleton;

/**
 *
 * @author bradley
 */
public class MainDriver {
    public static void main(String[] args) {
        Person person = Person.getInstance();
        person.sayHello();
    }
}
