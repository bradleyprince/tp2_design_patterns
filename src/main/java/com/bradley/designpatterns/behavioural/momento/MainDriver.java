/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.behavioural.momento;

/**
 *
 * @author bradley
 */
public class MainDriver {
    
    public static void main(String[] args) {
        DietInfoCareTaker dietInfoCareTaker = new DietInfoCareTaker();

        DietInfo dietInfo = new DietInfo("Fred", 1, 100);
        System.out.println(dietInfo);
        
        dietInfo.setDayNumber(2, 99);
        System.out.println(dietInfo);
        
        System.out.println("Saving state.");
        dietInfoCareTaker.saveState(dietInfo);
        
        dietInfo.setDayNumber(3, 98);
        System.out.println(dietInfo);
        
        dietInfo.setDayNumber(4, 97);
        System.out.println(dietInfo);
        
        System.out.println("Restoring saved state");
        dietInfoCareTaker.restoreState(dietInfo);
        System.out.println(dietInfo);
    }
      
}
