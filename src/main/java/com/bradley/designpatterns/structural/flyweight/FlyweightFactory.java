package com.bradley.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bradley
 */
public class FlyweightFactory {
    private static FlyweightFactory flyweightFactory;
    private Map<String, Flyweight> flyweightPool;

    public FlyweightFactory() {
        flyweightPool = new HashMap<String, Flyweight>();       
    }
    
    public static FlyweightFactory getinstance()
    {
        if (flyweightFactory == null){
            flyweightFactory = new FlyweightFactory();
        }
        
        return flyweightFactory;
    }
    
    public Flyweight getFlyweight(String key){
        if (flyweightPool.containsKey(key)){
            return flyweightPool.get(key);
        }else{
            Flyweight flyweight;
            
            if (key.equals("add")){
                flyweight = new FlywewightAdder();
            }else{
                flyweight = new FlyweightMultiplier();
            }
            
            flyweightPool.put(key, flyweight);
            
            return flyweight; 
        }
    }
}
