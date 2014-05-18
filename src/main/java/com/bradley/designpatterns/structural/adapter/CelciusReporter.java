/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.structural.adapter;

/**
 *
 * @author bradley
 */
public class CelciusReporter {
    double temperatureInc;

    public CelciusReporter() {
    }

    public double getTemperatureInc() {
        return temperatureInc;
    }

    public void setTemperatureInc(double temperatureInc) {
        this.temperatureInc = temperatureInc;
    }       
}
