/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.structural.adapter;

/**
 *
 * @author bradley
 */
public class TemperatureObjectReporter implements TemperatureInfo{
    CelciusReporter celciusReporter;

    public TemperatureObjectReporter() {
        celciusReporter = new CelciusReporter();
    }
    
    @Override
    public double getTemperatureInF() {
        return cToF(celciusReporter.temperatureInc);
    }

    @Override
    public void setTemperatureInF(double temperatureInF) {
        celciusReporter.setTemperatureInc(fToC(temperatureInF));
    }

    @Override
    public double getTemperatureInC() {
        return celciusReporter.temperatureInc;
    }

    @Override
    public void setTemperatureInC(double temperatureInC) {
        celciusReporter.setTemperatureInc(temperatureInC);
    }
    
    private double fToC(double f){
        return ((f - 32)* 5 / 9);
    }
    
    private double cToF(double c){
        return ((c * 9 / 5) + 32);
    }
}
