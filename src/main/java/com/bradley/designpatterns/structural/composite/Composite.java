package com.bradley.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bradley
 */
public class Composite implements Component{
    
    List<Component> components = new ArrayList<Component>();
    @Override
    public void sayHello() {
        for (Component component: components)
            component.sayHello();
    }

    @Override
    public void sayGoodBye() {
        for (Component component: components)
            component.sayGoodBye();
    }
    
    public void add(Component component){
            components.add(component);
    }
    
    
    public void remove(Component component)
    {
        components.remove(component);
    }
     
    public List<Component> getComponents()
    {
        return components;
    }
    
    public Component getComponent(int index)
    {
        return components.get(index);
    }
}