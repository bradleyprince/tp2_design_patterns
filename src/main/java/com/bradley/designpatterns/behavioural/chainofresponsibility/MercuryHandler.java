/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.behavioural.chainofresponsibility;

/**
 *
 * @author bradley
 */
public class MercuryHandler extends PlanetHandler{

    public void handleRequest(PlanetEnum request){
        if (request == PlanetEnum.MERCURY){
            System.out.println("MercuryHndler handles " + request);
            System.out.println("Mercury is hot");
        }else{
            System.out.println("MercuryHandler doesnt handle " + request);
            
            if (successor != null){
                successor.handleRequest(request);
            }
        }        
    } 
}
