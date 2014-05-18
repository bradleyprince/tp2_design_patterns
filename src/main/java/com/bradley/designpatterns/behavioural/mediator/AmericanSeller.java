/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.behavioural.mediator;

/**
 *
 * @author Balla
 */
public class AmericanSeller {
    Mediator mediator;
    float priceInDollars;

    public AmericanSeller(Mediator mediator, float priceInDollars) {
        this.mediator = mediator;
        this.priceInDollars = priceInDollars;
        this.mediator.registerAmericanSeller(this);
    }
    
    public boolean isBidAccepted(float bidInDollars)
    {
        if (bidInDollars >= priceInDollars)
        {
            System.out.println("Seller accepted the bid");
            return true;
        }
        else
        {
            System.out.println("Seller rejected the bid");
            return false;
        }
    }
}
