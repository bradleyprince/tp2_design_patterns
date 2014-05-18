/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.behavioural.chainofresponsibility;

/**
 *
 * @author bradley
 */
public class EarthHandler extends PlanetHandler{
    public void handleRequest(PlanetEnum request) {
        if (request == PlanetEnum.EARTH) {
            System.out.println("EarthHandler handles " + request);
            System.out.println("Earth is comfortable");
        }else{
            System.out.println("EarthHandler doesnt handle " + request);
            
            if (successor != null){
                successor.handleRequest(request);
            }
        }        
    } 
}
