/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.structural.adapter;

/**
 *
 * @author bradley
 */
public class TemperatureClassReporter extends CelciusReporter implements TemperatureInfo{
    
    @Override
    public double getTemperatureInC() {
        return temperatureInc;
    }
    
    @Override
    public double getTemperatureInF() {
        return cToF(temperatureInc);
    }
    
    @Override
    public void setTemperatureInC(double temperatureInC) {
        this.temperatureInc = temperatureInC;
    }
    
    @Override
    public void setTemperatureInF(double temperatureInF) {
        this.temperatureInc = fToC(temperatureInF);
    }

    private double fToC(double f){
        return ((f - 32)* 5 / 9);
    }
    
    private double cToF(double c){
        return ((c * 9 / 5) + 32);
    }
}
