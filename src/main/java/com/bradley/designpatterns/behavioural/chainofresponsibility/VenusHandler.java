/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.behavioural.chainofresponsibility;

/**
 *
 * @author bradley
 */
public class VenusHandler extends PlanetHandler{
    public void handleRequest(PlanetEnum request) {
        
        if (request == PlanetEnum.VENUS){
            System.out.println("VenusHandler handles " + request);
            System.out.println("Venus is poisonous");
        }else{
            System.out.println("VenusHandler doesnt handle " + request);
            
            if (successor != null){
                successor.handleRequest(request);
            }
        }        
    } 
}
