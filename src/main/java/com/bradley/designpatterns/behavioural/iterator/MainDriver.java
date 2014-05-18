/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.behavioural.iterator;

import java.util.Iterator;

/**
 *
 * @author bradley
 */

public class MainDriver {
    public static void main(String[] args) {
        Item i1 = new Item("spaghetti", 7.50f);
        Item i2 = new Item("hamburger", 6.00f);
        Item i3 = new Item("chicken sandwich", 6.50f);
        Item i4 = new Item("salt", 1.50f);
        
        Menu menu = new Menu();
        menu.addItem(i1);
        menu.addItem(i2);
        menu.addItem(i3);
        
        System.out.println("Displaying Menu:");
        Iterator<Item> iterator = menu.iterator();
        
        while(iterator.hasNext()){
            Item item = iterator.next();
            System.out.println(item);
        }
        
        System.out.println("\nRemoving last item returned");
        iterator.remove();
        
        System.out.println("Displaying Menu:");
        iterator = menu.iterator();
        
        while(iterator.hasNext()){
            Item item = iterator.next();
            System.out.println(item);
        }
        
        System.out.println("\nAdding a new item");
        menu.addItem(i4);   
        
        System.out.println("Displaying Menu:");
        iterator = menu.iterator();
        
        while(iterator.hasNext()){
            Item item = iterator.next();
            System.out.println(item);
        }
        
    }
}
