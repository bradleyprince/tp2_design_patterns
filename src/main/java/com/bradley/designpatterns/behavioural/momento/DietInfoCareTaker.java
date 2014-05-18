/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.behavioural.momento;

/**
 *
 * @author bradley
 */
public class DietInfoCareTaker {
    Object objMemento;
    
    public void saveState(DietInfo dietInfo){
        objMemento = dietInfo.save();
    }
    
    public void restoreState(DietInfo dietInfo){
        dietInfo.restore(objMemento);
    }
}
