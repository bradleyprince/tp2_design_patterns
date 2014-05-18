/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterns.behavioural.visitor;

/**
 *
 * @author bradley
 */
public interface NumberElement {
    public void accept(NumberVisitor visitor);
}
