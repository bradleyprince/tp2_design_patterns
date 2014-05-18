/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.behavioural.strategy;

/**
 *
 * @author bradley
 */
public class SkiStrategy implements Strategy{
    
    @Override
    public boolean checkTemperature(int temperatureInF) {
        if (temperatureInF <= 32)
            return true;
        else
            return false;
    }
}
