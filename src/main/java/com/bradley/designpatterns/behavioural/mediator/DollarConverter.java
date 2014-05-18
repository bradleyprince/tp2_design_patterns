/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.behavioural.mediator;

/**
 *
 * @author bradley
 */
public class DollarConverter {
    Mediator mediator;
    public static final float DOLLAR_UNIT = 1.0f;
    public static final float EURO_UNIT = 0.7f;
    public static final float KRONE_UNIT = 8.0f;

    public DollarConverter(Mediator mediator) {
        this.mediator = mediator;
        mediator.registerDollerConverter(this);
    }
    
    public float convertEurosToDollars(float euros){
        float dollars = euros * (DOLLAR_UNIT / EURO_UNIT);
        System.out.println("Converting " + euros + " euros to " + dollars + " dollars");
        return dollars;
    }
    
    public float convertKronaToDollars(float krona){
        float dollars = krona * (DOLLAR_UNIT / KRONE_UNIT);
        System.out.println("Converting " + krona + " krona to " + dollars + " dollars");
        
        return dollars;
    }
    
    public float convertCurrencyToDollars(float amount, String unitOfCurrency){
        if (unitOfCurrency.equals("krona")){
            return convertKronaToDollars(amount);
        }else{
            return convertEurosToDollars(amount);
        }
    }
}
