/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.behavioural.mediator;

/**
 *
 * @author bradley
 */
public class MainDriver {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        
        Buyer swedishBuyer = new SwedishBuyer(mediator);
        Buyer frenchBuyer = new FrenchBuyer(mediator);
        float sellingPriceInDollar = 10.0f;
        AmericanSeller americanSeller = new AmericanSeller(mediator, sellingPriceInDollar);
        DollarConverter dollarConverter = new DollarConverter(mediator);
        
        float swedishBidInKrona = 55.0f;
        
        while(!swedishBuyer.attemptToPurchase(swedishBidInKrona)){
            swedishBidInKrona += 15.0f;
        }
        
        float frenchBidInEuros = 3.0f;
        
        while(!frenchBuyer.attemptToPurchase(frenchBidInEuros)){
            frenchBidInEuros += 1.5f;
        }
    }
}
