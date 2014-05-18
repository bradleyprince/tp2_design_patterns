/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.behavioural.chainofresponsibility;

/**
 *
 * @author bradley
 */
public abstract class PlanetHandler {
    PlanetHandler successor;

    public void setSuccessor(PlanetHandler successor) {
        this.successor = successor;
    }
    
    public abstract void handleRequest(PlanetEnum request);
}
