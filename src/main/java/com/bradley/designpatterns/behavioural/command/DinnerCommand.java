/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.behavioural.command;

/**
 *
 * @author bradley
 */
public class DinnerCommand implements Command{
    Dinner dinner;

    public DinnerCommand(Dinner dinner) {
        this.dinner = dinner;
    }
    
    @Override
    public void execute() {
        dinner.makeDinner();
    }
    
}
