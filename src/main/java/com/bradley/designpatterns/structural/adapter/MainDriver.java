/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.structural.adapter;

/**
 *
 * @author bradley
 */
public class MainDriver {
    public static void main(String[] args) {
        System.out.println("class adapter test");
        TemperatureInfo tempInfo = new TemperatureClassReporter();
        testTempInfo(tempInfo);
        
        System.out.println("\nobject adapter test");
        tempInfo = new TemperatureObjectReporter();
        testTempInfo(tempInfo);
    }
    
    public static void testTempInfo(TemperatureInfo tempInfo){
        tempInfo.setTemperatureInC(0);
        System.out.println("temp in C: " + tempInfo.getTemperatureInC());
        System.out.println("temp in F: " + tempInfo.getTemperatureInF());
        
        tempInfo.setTemperatureInF(85);
        System.out.println("temp in C: " + tempInfo.getTemperatureInC());
        System.out.println("temp in F: " + tempInfo.getTemperatureInF());
    }
}
