/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.behavioural.command;

/**
 *
 * @author bradley
 */
public class LunchCommand implements Command{
    Lunch lunch;

    public LunchCommand(Lunch lunch) {
        this.lunch = lunch;
    }
    
    @Override
    public void execute() {
        lunch.makeLunch();
    }
    
}
