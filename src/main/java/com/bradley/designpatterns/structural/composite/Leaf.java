package com.bradley.designpatterns.structural.composite;

/**
 *
 * @author bradley
 */
public class Leaf implements Component{

    String name;

    public Leaf(String name) {
        this.name = name;
    }
    
    @Override
    public void sayHello() {
        System.out.println(name + " leaf says hello");         
    }

    @Override
    public void sayGoodBye() {
        System.out.println(name + " leaf says goodbye");
    }
    
}
